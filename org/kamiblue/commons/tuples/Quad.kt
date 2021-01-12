package org.kamiblue.commons.tuples

import java.io.Serializable

data class Quad<out A, out B, out C, out D>(
        val first: A,
        val second: B,
        val third: C,
        val fourth: D
) : Serializable {
    constructor(first: A, triple: Triple<B, C, D>) : this(first, triple.first, triple.second, triple.third)
    constructor(pair1: Pair<A, B>, pair2: Pair<C, D>) : this(pair1.first, pair1.second, pair2.first, pair2.second)
    constructor(triple: Triple<A, B, C>, fourth: D) : this(triple.first, triple.second, triple.third, fourth)

    override fun toString(): String = "($first, $second, $third, $fourth)"
}