package org.kamiblue.commons.extension

import java.util.*
import java.util.stream.DoubleStream
import java.util.stream.IntStream
import java.util.stream.LongStream
import java.util.stream.Stream

fun BooleanArray.stream(): Stream<Boolean> = Arrays.stream(this.toTypedArray())

fun ByteArray.stream(): Stream<Byte> = Arrays.stream(this.toTypedArray())

fun ShortArray.stream(): Stream<Short> = Arrays.stream(this.toTypedArray())

fun IntArray.stream(): IntStream = Arrays.stream(this)

fun LongArray.stream(): LongStream = Arrays.stream(this)

fun FloatArray.stream(): Stream<Float> = Arrays.stream(this.toTypedArray())

fun DoubleArray.stream(): DoubleStream = Arrays.stream(this)

fun CharArray.stream(): Stream<Char> = Arrays.stream(this.toTypedArray())

fun <T> Array<out T>.stream(): Stream<T> = Arrays.stream(this)
