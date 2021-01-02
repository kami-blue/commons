package org.kamiblue.commons.extension

/**
 * Eg, "house".max(4) will return "hous"
 * @return [this] with the length limited to [max]
 */
fun String.max(max: Int) = this.substring(0, this.length.coerceAtMost(max))

/**
 * Eg, "house".max(4, "error") will return "erro"
 * @return [this.max] with a message appended
 */
fun String.max(max: Int, suffix: String): String {
    return if (length > max) {
        (max(max - suffix.length) + suffix).max(max)
    } else {
        max(max)
    }
}

fun String.surroundedBy(prefix: CharSequence, suffix: CharSequence, ignoreCase: Boolean = false) =
    this.startsWith(prefix, ignoreCase) && this.endsWith(suffix, ignoreCase)

fun String.surroundedBy(prefix: Char, suffix: Char, ignoreCase: Boolean = false) =
    this.startsWith(prefix, ignoreCase) && this.endsWith(suffix, ignoreCase)

fun String.mapEach(vararg delimiters: Char, transformer: (String) -> String) =
    split(*delimiters).map(transformer)