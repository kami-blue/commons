package org.kamiblue.commons.utils

inline fun buildString(block: StringBuilder.() -> Unit) =
    StringBuilder().apply(block).toString()