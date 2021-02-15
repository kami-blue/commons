package org.kamiblue.commons.extension

import java.util.*

fun <K, V> MutableMap<K, V>.synchronized(): MutableMap<K, V> =
    Collections.synchronizedMap(this)

fun <K, V> SortedMap<K, V>.synchronized(): SortedMap<K, V> =
    Collections.synchronizedSortedMap(this)

fun <K, V> NavigableMap<K, V>.synchronized(): NavigableMap<K, V> =
    Collections.synchronizedNavigableMap(this)