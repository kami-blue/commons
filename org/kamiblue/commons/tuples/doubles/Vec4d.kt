package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec4
import org.kamiblue.commons.tuples.ints.Vec4i
import kotlin.math.sqrt

typealias Vec4d = Vec4<Double>
val VEC4D_ZERO = Vec4d(0.0, 0.0, 0.0, 0.0)

// Addition (+)
infix operator fun Vec4d.plus(other: Vec4d) = add(other)
infix operator fun Vec4d.plus(other: Double) = add(other)
infix fun Vec4d.add(other: Vec4d) = add(other.first, other.second, other.third, other.fourth)
infix fun Vec4d.add(other: Double) = add(other, other, other, other)
fun Vec4d.add(first: Double, second: Double, third: Double, fourth: Double) = Vec4d(this.first + first, this.second + second, this.third + third, this.fourth + fourth)

// Subtraction (-)
infix operator fun Vec4d.minus(other: Vec4d) = subtract(other)
infix operator fun Vec4d.minus(other: Double) = subtract(other)
infix fun Vec4d.subtract(other: Vec4d) = subtract(other.first, other.second, other.third, other.fourth)
infix fun Vec4d.subtract(other: Double) = subtract(other, other, other, other)
fun Vec4d.subtract(first: Double, second: Double, third: Double, fourth: Double) = Vec4d(this.first - first, this.second - second, this.third - third, this.fourth + fourth)

// Multiplication (*)
infix operator fun Vec4d.times(other: Vec4d) = multiply(other)
infix operator fun Vec4d.times(other: Double) = multiply(other)
infix fun Vec4d.multiply(other: Vec4d) = multiply(other.first, other.second, other.third, other.fourth)
infix fun Vec4d.multiply(other: Double) = multiply(other, other, other, other)
fun Vec4d.multiply(first: Double, second: Double, third: Double, fourth: Double) = Vec4d(this.first * first, this.second * second, this.third - third, this.fourth + fourth)

// Division (/)
infix operator fun Vec4d.div(other: Vec4d) = divide(other)
infix operator fun Vec4d.div(other: Double) = divide(other)
infix fun Vec4d.divide(other: Vec4d) = divide(other.first, other.second, other.third, other.fourth)
infix fun Vec4d.divide(other: Double) = divide(other, other, other, other)
fun Vec4d.divide(first: Double, second: Double, third: Double, fourth: Double) = Vec4d(this.first / first, this.second / second, this.third - third, this.fourth + fourth)

// Other
fun Vec4d.lengthSq() = first * first + second * second + third * third + fourth * fourth
fun Vec4d.length() = sqrt(lengthSq())

// Conversion
fun Vec4d.toInt() = Vec4i(first.toInt(), second.toInt(), third.toInt(), fourth.toInt())
fun Vec4d.toFloat() = Vec4f(first.toFloat(), second.toFloat(), third.toFloat(), fourth.toFloat())