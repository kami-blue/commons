package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.ints.Vec2i
import kotlin.math.sqrt

typealias Vec2f = Vec2<Float>
val VEC2F_ZERO = Vec2f(0.0f, 0.0f)

// Addition (+)
infix operator fun Vec2f.plus(other: Vec2f) = add(other)
infix operator fun Vec2f.plus(other: Float) = add(other)
infix fun Vec2f.add(other: Vec2f) = add(other.first, other.second)
infix fun Vec2f.add(other: Float) = add(other, other)
fun Vec2f.add(first: Float, second: Float) = Vec2f(this.first + first, this.second + second)

// Subtraction (-)
infix operator fun Vec2f.minus(other: Vec2f) = subtract(other)
infix operator fun Vec2f.minus(other: Float) = subtract(other)
infix fun Vec2f.subtract(other: Vec2f) = subtract(other.first, other.second)
infix fun Vec2f.subtract(other: Float) = subtract(other, other)
fun Vec2f.subtract(first: Float, second: Float) = Vec2f(this.first - first, this.second - second)

// Multiplication (*)
infix operator fun Vec2f.times(other: Vec2f) = multiply(other)
infix operator fun Vec2f.times(other: Float) = multiply(other)
infix fun Vec2f.multiply(other: Vec2f) = multiply(other.first, other.second)
infix fun Vec2f.multiply(other: Float) = multiply(other, other)
fun Vec2f.multiply(first: Float, second: Float) = Vec2f(this.first * first, this.second * second)

// Division (/)
infix operator fun Vec2f.div(other: Vec2f) = divide(other)
infix operator fun Vec2f.div(other: Float) = divide(other)
infix fun Vec2f.divide(other: Vec2f) = divide(other.first, other.second)
infix fun Vec2f.divide(other: Float) = divide(other, other)
fun Vec2f.divide(first: Float, second: Float) = Vec2f(this.first / first, this.second / second)

// Other
fun Vec2f.lengthSq() = first * first + second * second
fun Vec2f.length() = sqrt(lengthSq())

// Conversion
fun Vec2f.toInt() = Vec2i(first.toInt(), second.toInt())
fun Vec2f.toDouble() = Vec2d(first.toDouble(), second.toDouble())