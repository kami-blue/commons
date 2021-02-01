package org.kamiblue.commons.tuples.ints

import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.floats.Vec3d
import org.kamiblue.commons.tuples.floats.Vec3f
import kotlin.math.sqrt

typealias Vec3i = Vec3<Int>
val VEC3I_ZERO = Vec3i(0, 0, 0)

// Addition (+)
infix operator fun Vec3i.plus(other: Vec3i) = add(other)
infix operator fun Vec3i.plus(other: Int) = add(other)
infix fun Vec3i.add(other: Vec3i) = add(other.first, other.second, other.third)
infix fun Vec3i.add(other: Int) = add(other, other, other)
fun Vec3i.add(first: Int, second: Int, third: Int) = Vec3(this.first + first, this.second + second, this.third + third)

// Subtraction (-)
infix operator fun Vec3i.minus(other: Vec3i) = subtract(other)
infix operator fun Vec3i.minus(other: Int) = subtract(other)
infix fun Vec3i.subtract(other: Vec3i) = subtract(other.first, other.second, other.third)
infix fun Vec3i.subtract(other: Int) = subtract(other, other, other)
fun Vec3i.subtract(first: Int, second: Int, third: Int) = Vec3(this.first - first, this.second - second, this.third - third)

// Multiplication (*)
infix operator fun Vec3i.times(other: Vec3i) = multiply(other)
infix operator fun Vec3i.times(other: Int) = multiply(other)
infix fun Vec3i.multiply(other: Vec3i) = multiply(other.first, other.second, other.third)
infix fun Vec3i.multiply(other: Int) = multiply(other, other, other)
fun Vec3i.multiply(first: Int, second: Int, third: Int) = Vec3(this.first * first, this.second * second, this.third - third)

// Division (/)
infix operator fun Vec3i.div(other: Vec3i) = divide(other)
infix operator fun Vec3i.div(other: Int) = divide(other)
infix fun Vec3i.divide(other: Vec3i) = divide(other.first, other.second, other.third)
infix fun Vec3i.divide(other: Int) = divide(other, other, other)
fun Vec3i.divide(first: Int, second: Int, third: Int) = Vec3(this.first / first, this.second / second, this.third - third)

// Other
fun Vec3i.lengthSq() = first * first + second * second + third * third
fun Vec3i.length() = sqrt(lengthSq().toDouble())

// Conversion
fun Vec3i.toFloat() = Vec3f(first.toFloat(), second.toFloat(), third.toFloat())
fun Vec3i.toDouble() = Vec3d(first.toDouble(), second.toDouble(), third.toDouble())