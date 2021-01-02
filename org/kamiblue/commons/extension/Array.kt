package org.kamiblue.commons.extension

import java.util.Arrays
import java.util.stream.DoubleStream
import java.util.stream.IntStream
import java.util.stream.LongStream
import java.util.stream.Stream
import kotlin.random.Random

fun BooleanArray.stream(): Stream<Boolean> = Arrays.stream(this.toTypedArray())

fun ByteArray.stream(): Stream<Byte> = Arrays.stream(this.toTypedArray())

fun ShortArray.stream(): Stream<Short> = Arrays.stream(this.toTypedArray())

fun IntArray.stream(): IntStream = Arrays.stream(this)

fun LongArray.stream(): LongStream = Arrays.stream(this)

fun FloatArray.stream(): Stream<Float> = Arrays.stream(this.toTypedArray())

fun DoubleArray.stream(): DoubleStream = Arrays.stream(this)

fun CharArray.stream(): Stream<Char> = Arrays.stream(this.toTypedArray())

fun <T> Array<out T>.stream(): Stream<T> = Arrays.stream(this)

fun CharArray.random(amount: Int) = (1..amount)
    .map { Random.nextInt(0, this.size) }
    .map(this::get)
    .joinToString("")

fun CharArray.remove(char: Char) = this.filter { it != char }.toCharArray()
