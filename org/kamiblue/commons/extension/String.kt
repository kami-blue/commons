package org.kamiblue.commons.extension

/**
 * Eg, "house".max(4) will return "hous"
 * @return [this] with the length limited to [max]
 */
fun String.max(max: Int) = this.substring(0, this.length.coerceAtMost(max))

fun String.surroundedBy(prefix: CharSequence, suffix: CharSequence, ignoreCase: Boolean = false) =
    this.startsWith(prefix, ignoreCase) && this.endsWith(suffix, ignoreCase)

fun String.surroundedBy(prefix: Char, suffix: Char, ignoreCase: Boolean = false) =
    this.startsWith(prefix, ignoreCase) && this.endsWith(suffix, ignoreCase)