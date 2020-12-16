package org.kamiblue.commons.extension

/**
 * @return [this] with the length limited to [max]
 */
fun String.max(max: Int) = this.substring(0, this.length.coerceAtMost(max))
