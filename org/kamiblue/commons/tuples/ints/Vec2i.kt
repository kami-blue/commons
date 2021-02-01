package org.kamiblue.commons.tuples.ints

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.floats.Vec2d
import org.kamiblue.commons.tuples.floats.Vec2f
import kotlin.math.sqrt

typealias Vec2i = Vec2<Int>
val VEC2I_ZERO = Vec2i(0, 0)

// Addition (+)
infix operator fun Vec2i.plus(other: Vec2i) = add(other)
infix operator fun Vec2i.plus(other: Int) = add(other)
infix fun Vec2i.add(other: Vec2i) = add(other.first, other.second)
infix fun Vec2i.add(other: Int) = add(other, other)
fun Vec2i.add(first: Int, second: Int) = Vec2i(this.first + first, this.second + second)

// Subtraction (-)
infix operator fun Vec2i.minus(other: Vec2i) = subtract(other)
infix operator fun Vec2i.minus(other: Int) = subtract(other)
infix fun Vec2i.subtract(other: Vec2i) = subtract(other.first, other.second)
infix fun Vec2i.subtract(other: Int) = subtract(other, other)
fun Vec2i.subtract(first: Int, second: Int) = Vec2i(this.first - first, this.second - second)

// Multiplication (*)
infix operator fun Vec2i.times(other: Vec2i) = multiply(other)
infix operator fun Vec2i.times(other: Int) = multiply(other)
infix fun Vec2i.multiply(other: Vec2i) = multiply(other.first, other.second)
infix fun Vec2i.multiply(other: Int) = multiply(other, other)
fun Vec2i.multiply(first: Int, second: Int) = Vec2i(this.first * first, this.second * second)

// Division (/)
infix operator fun Vec2i.div(other: Vec2i) = divide(other)
infix operator fun Vec2i.div(other: Int) = divide(other)
infix fun Vec2i.divide(other: Vec2i) = divide(other.first, other.second)
infix fun Vec2i.divide(other: Int) = divide(other, other)
fun Vec2i.divide(first: Int, second: Int) = Vec2i(this.first / first, this.second / second)

// Other
fun Vec2i.lengthSq() = first * first + second * second
fun Vec2i.length() = sqrt(lengthSq().toDouble())

// Conversion
fun Vec2i.toFloat() = Vec2f(first.toFloat(), second.toFloat())
fun Vec2i.toDouble() = Vec2d(first.toDouble(), second.toDouble())