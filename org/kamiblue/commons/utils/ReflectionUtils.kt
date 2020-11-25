package org.kamiblue.commons.utils

import org.kamiblue.commons.extension.add
import java.io.File
import java.lang.reflect.Method

object ReflectionUtils {

    private val defaultFunctions = Any::class.java.methods.toHashSet()
    private val classRegex = ".class$".toRegex()

    inline fun <reified T> getSubclassOfFast(packageName: String) = getSubclassOf<T>(packageName) {
        !it.name.contains('$')
    }

    inline fun <reified T> getSubclassOf(packageName: String, crossinline filter: (File) -> Boolean = { true }): List<Class<out T>> {
        val classList = ArrayList<Class<out T>>()
        val typeClass = T::class.java

        getPathsForPackage(packageName).forEach { pathName ->
            File(pathName).listAllFiles { it.name.endsWith(".class") && filter(it) }.forEach { file ->
                try {
                    file.toClass(packageName)?.let {
                        if (typeClass.isAssignableFrom(it)) {
                            @Suppress("UNCHECKED_CAST")
                            classList.add(it as? Class<out T>)
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        return classList
    }

    fun getTopLevelFunctions(packageName: String): List<Method> {
        val functionList = ArrayList<Method>()

        getPathsForPackage(packageName).forEach { pathName ->
            File(pathName).listAllFiles { it.name.endsWith("Kt.class") }.forEach { file ->
                file.toClass(packageName)?.methods?.forEach {
                    if (!defaultFunctions.contains(it)) functionList.add(it)
                }
            }
        }

        return functionList
    }

    fun getPathsForPackage(packageName: String): List<String> =
        Thread.currentThread().contextClassLoader
            .getResources(packageName.replace('.', '/'))
            .toList()
            .map { it.file }

    fun File.listAllFiles(filter: (File) -> Boolean): List<File> {
        val list = ArrayList<File>()
        this.listFiles()?.forEach {
            if (it.isDirectory) list.addAll(it.listAllFiles(filter))
            else if (filter(it)) list.add(it)
        }
        return list
    }

    fun File.toClass(packageName: String) = try {
        val relativePath = this.path
            .replace('\\', '.')
            .substringAfterLast(packageName)
            .replace(classRegex, "")
        Class.forName("$packageName$relativePath", false, Thread.currentThread().contextClassLoader)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    inline val <reified T> Class<out T>.instance : T get() = this.getDeclaredField("INSTANCE")[null] as T

}