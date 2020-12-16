package org.kamiblue.commons.extension

/**
 * Eg, "house".max(4) will return "hous"
 * @return [this] with the length limited to [max]
 */
fun String.max(max: Int) = this.substring(0, this.length.coerceAtMost(max))
