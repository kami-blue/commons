package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec4
import org.kamiblue.commons.tuples.ints.Vec4i
import kotlin.math.sqrt

typealias Vec4f = Vec4<Float>
val VEC4F_ZERO = Vec4f(0.0f, 0.0f, 0.0f, 0.0f)

// Addition (+)
infix operator fun Vec4f.plus(other: Vec4f) = add(other)
infix operator fun Vec4f.plus(other: Float) = add(other)
infix fun Vec4f.add(other: Vec4f) = add(other.first, other.second, other.third, other.fourth)
infix fun Vec4f.add(other: Float) = add(other, other, other, other)
fun Vec4f.add(first: Float, second: Float, third: Float, fourth: Float) = Vec4f(this.first + first, this.second + second, this.third + third, this.fourth + fourth)

// Subtraction (-)
infix operator fun Vec4f.minus(other: Vec4f) = subtract(other)
infix operator fun Vec4f.minus(other: Float) = subtract(other)
infix fun Vec4f.subtract(other: Vec4f) = subtract(other.first, other.second, other.third, other.fourth)
infix fun Vec4f.subtract(other: Float) = subtract(other, other, other, other)
fun Vec4f.subtract(first: Float, second: Float, third: Float, fourth: Float) = Vec4f(this.first - first, this.second - second, this.third - third, this.fourth + fourth)

// Multiplication (*)
infix operator fun Vec4f.times(other: Vec4f) = multiply(other)
infix operator fun Vec4f.times(other: Float) = multiply(other)
infix fun Vec4f.multiply(other: Vec4f) = multiply(other.first, other.second, other.third, other.fourth)
infix fun Vec4f.multiply(other: Float) = multiply(other, other, other, other)
fun Vec4f.multiply(first: Float, second: Float, third: Float, fourth: Float) = Vec4f(this.first * first, this.second * second, this.third - third, this.fourth + fourth)

// Division (/)
infix operator fun Vec4f.div(other: Vec4f) = divide(other)
infix operator fun Vec4f.div(other: Float) = divide(other)
infix fun Vec4f.divide(other: Vec4f) = divide(other.first, other.second, other.third, other.fourth)
infix fun Vec4f.divide(other: Float) = divide(other, other, other, other)
fun Vec4f.divide(first: Float, second: Float, third: Float, fourth: Float) = Vec4f(this.first / first, this.second / second, this.third - third, this.fourth + fourth)

// Other
fun Vec4f.lengthSq() = first * first + second * second + third * third + fourth * fourth
fun Vec4f.length() = sqrt(lengthSq())

// Conversion
fun Vec4f.toInt() = Vec4i(first.toInt(), second.toInt(), third.toInt(), fourth.toInt())
fun Vec4f.toDouble() = Vec4d(first.toDouble(), second.toDouble(), third.toDouble(), fourth.toDouble())