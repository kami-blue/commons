package org.kamiblue.commons.utils

import java.awt.Desktop
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

object SystemUtils {

    fun setClipboard(text: String) {
        val selection = StringSelection(text)
        val clipboard: Clipboard = Toolkit.getDefaultToolkit().systemClipboard
        clipboard.setContents(selection, null)
    }

    fun getClipboard(): String? {
        val clipboard: Clipboard = Toolkit.getDefaultToolkit().systemClipboard
        return try {
            clipboard.getData(DataFlavor.stringFlavor)?.toString()
        } catch (e: Exception) {
            null
        }
    }

    fun getOperatingSystem(): OperatingSystem {
        val myOS = System.getProperty("os.name").toLowerCase()

        if (Desktop.isDesktopSupported()
        //This is important because apparently bspwm and a few other
        //window managers return true for isDesktopSupported
            && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) return OperatingSystem.WINDOWS
        else {
            if (myOS.contains("mac")) return OperatingSystem.MACOS
            return OperatingSystem.LINUX
        }
    }

    enum class OperatingSystem {
        WINDOWS,
        MACOS,
        LINUX;
    }

}
