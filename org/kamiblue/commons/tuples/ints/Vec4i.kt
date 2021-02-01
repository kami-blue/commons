 package org.kamiblue.commons.tuples.ints

import org.kamiblue.commons.tuples.Vec4
import org.kamiblue.commons.tuples.floats.Vec4d
import org.kamiblue.commons.tuples.floats.Vec4f
import kotlin.math.sqrt

typealias Vec4i = Vec4<Int>
val VEC4I_ZERO = Vec4i(0, 0, 0, 0)

// Addition (+)
infix operator fun Vec4i.plus(other: Vec4i) = add(other)
infix operator fun Vec4i.plus(other: Int) = add(other)
infix fun Vec4i.add(other: Vec4i) = add(other.first, other.second, other.third, other.fourth)
infix fun Vec4i.add(other: Int) = add(other, other, other, other)
fun Vec4i.add(first: Int, second: Int, third: Int, fourth: Int) = Vec4i(this.first + first, this.second + second, this.third + third, this.fourth + fourth)

// Subtraction (-)
infix operator fun Vec4i.minus(other: Vec4i) = subtract(other)
infix operator fun Vec4i.minus(other: Int) = subtract(other)
infix fun Vec4i.subtract(other: Vec4i) = subtract(other.first, other.second, other.third, other.fourth)
infix fun Vec4i.subtract(other: Int) = subtract(other, other, other, other)
fun Vec4i.subtract(first: Int, second: Int, third: Int, fourth: Int) = Vec4i(this.first - first, this.second - second, this.third - third, this.fourth + fourth)

// Multiplication (*)
infix operator fun Vec4i.times(other: Vec4i) = multiply(other)
infix operator fun Vec4i.times(other: Int) = multiply(other)
infix fun Vec4i.multiply(other: Vec4i) = multiply(other.first, other.second, other.third, other.fourth)
infix fun Vec4i.multiply(other: Int) = multiply(other, other, other, other)
fun Vec4i.multiply(first: Int, second: Int, third: Int, fourth: Int) = Vec4i(this.first * first, this.second * second, this.third - third, this.fourth + fourth)

// Division (/)
infix operator fun Vec4i.div(other: Vec4i) = divide(other)
infix operator fun Vec4i.div(other: Int) = divide(other)
infix fun Vec4i.divide(other: Vec4i) = divide(other.first, other.second, other.third, other.fourth)
infix fun Vec4i.divide(other: Int) = divide(other, other, other, other)
fun Vec4i.divide(first: Int, second: Int, third: Int, fourth: Int) = Vec4i(this.first / first, this.second / second, this.third - third, this.fourth + fourth)

// Other
fun Vec4i.lengthSq() = first * first + second * second + third * third + fourth * fourth
fun Vec4i.length() = sqrt(lengthSq().toDouble())

// Conversion
fun Vec4i.toFloat() = Vec4f(first.toFloat(), second.toFloat(), third.toFloat(), fourth.toFloat())
fun Vec4i.toDouble() = Vec4d(first.toDouble(), second.toDouble(), third.toDouble(), fourth.toDouble())