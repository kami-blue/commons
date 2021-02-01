package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.ints.Vec2i
import kotlin.math.sqrt

typealias Vec2d = Vec2<Double>
val VEC2D_ZERO = Vec2d(0.0, 0.0)

// Addition (+)
infix operator fun Vec2d.plus(other: Vec2d) = add(other)
infix operator fun Vec2d.plus(other: Double) = add(other)
infix fun Vec2d.add(other: Vec2d) = add(other.first, other.second)
infix fun Vec2d.add(other: Double) = add(other, other)
fun Vec2d.add(first: Double, second: Double) = Vec2d(this.first + first, this.second + second)

// Subtraction (-)
infix operator fun Vec2d.minus(other: Vec2d) = subtract(other)
infix operator fun Vec2d.minus(other: Double) = subtract(other)
infix fun Vec2d.subtract(other: Vec2d) = subtract(other.first, other.second)
infix fun Vec2d.subtract(other: Double) = subtract(other, other)
fun Vec2d.subtract(first: Double, second: Double) = Vec2d(this.first - first, this.second - second)

// Multiplication (*)
infix operator fun Vec2d.times(other: Vec2d) = multiply(other)
infix operator fun Vec2d.times(other: Double) = multiply(other)
infix fun Vec2d.multiply(other: Vec2d) = multiply(other.first, other.second)
infix fun Vec2d.multiply(other: Double) = multiply(other, other)
fun Vec2d.multiply(first: Double, second: Double) = Vec2d(this.first * first, this.second * second)

// Division (/)
infix operator fun Vec2d.div(other: Vec2d) = divide(other)
infix operator fun Vec2d.div(other: Double) = divide(other)
infix fun Vec2d.divide(other: Vec2d) = divide(other.first, other.second)
infix fun Vec2d.divide(other: Double) = divide(other, other)
fun Vec2d.divide(first: Double, second: Double) = Vec2d(this.first / first, this.second / second)

// Other
fun Vec2d.lengthSq() = first * first + second * second
fun Vec2d.length() = sqrt(lengthSq())

// Conversion
fun Vec2d.toInt() = Vec2i(first.toInt(), second.toInt())
fun Vec2d.toFloat() = Vec2f(first.toFloat(), second.toFloat())