package org.kamiblue.commons.utils

import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection

object ConnectionUtils {
    fun requestRawJsonFrom(url: String, catch: (Exception) -> Unit = { it.printStackTrace() }): String? {
        return runConnection(url, {
            it.setRequestProperty("Content-Type", "application/json; charset=UTF-8")
            it.requestMethod = "GET"
            it.inputStream.run {
                val scanner = Scanner(this).useDelimiter("\\A")
                val response = if (scanner.hasNext()) scanner.next() else null
                this.close()
                if (response?.isNotBlank() == true) response else null
            }
        }, catch)
    }

    fun <T> runConnection(url: String, block: (HttpsURLConnection) -> T?, catch: (Exception) -> Unit = { it.printStackTrace() }): T? {
        (URL(url).openConnection() as HttpsURLConnection).run {
            return try {
                doOutput = true
                doInput = true
                block(this)
            } catch (e: Exception) {
                catch(e)
                null
            } finally {
                disconnect()
            }
        }
    }
}