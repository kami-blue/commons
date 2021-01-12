package org.kamiblue.commons.tuples

fun <A, B, C> Triple(first: A, pair: Pair<B, C>) = Triple(first, pair.first, pair.second)
fun <A, B, C> Triple(pair: Pair<A, B>, third: C) = Triple(pair.first, pair.second, third)

inline fun <reified T> Pair<T, T>.toArray() = arrayOf(first, second)
inline fun <reified T> Triple<T, T, T>.toArray() = arrayOf(first, second, third)
inline fun <reified T> Quad<T, T, T, T>.toArray() = arrayOf(first, second, third, fourth)

fun <T> Quad<T, T, T, T>.toList() = listOf(first, second, third, fourth)