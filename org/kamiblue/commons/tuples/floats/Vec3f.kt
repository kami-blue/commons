package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.ints.Vec3i
import kotlin.math.sqrt

typealias Vec3f = Vec3<Float>
val VEC3F_ZERO = Vec3f(0.0f, 0.0f, 0.0f)

// Addition (+)
infix operator fun Vec3f.plus(other: Vec3f) = add(other)
infix operator fun Vec3f.plus(other: Float) = add(other)
infix fun Vec3f.add(other: Vec3f) = add(other.first, other.second, other.third)
infix fun Vec3f.add(other: Float) = add(other, other, other)
fun Vec3f.add(first: Float, second: Float, third: Float) = Vec3f(this.first + first, this.second + second, this.third + third)

// Subtraction (-)
infix operator fun Vec3f.minus(other: Vec3f) = subtract(other)
infix operator fun Vec3f.minus(other: Float) = subtract(other)
infix fun Vec3f.subtract(other: Vec3f) = subtract(other.first, other.second, other.third)
infix fun Vec3f.subtract(other: Float) = subtract(other, other, other)
fun Vec3f.subtract(first: Float, second: Float, third: Float) = Vec3f(this.first - first, this.second - second, this.third - third)

// Multiplication (*)
infix operator fun Vec3f.times(other: Vec3f) = multiply(other)
infix operator fun Vec3f.times(other: Float) = multiply(other)
infix fun Vec3f.multiply(other: Vec3f) = multiply(other.first, other.second, other.third)
infix fun Vec3f.multiply(other: Float) = multiply(other, other, other)
fun Vec3f.multiply(first: Float, second: Float, third: Float) = Vec3f(this.first * first, this.second * second, this.third - third)

// Division (/)
infix operator fun Vec3f.div(other: Vec3f) = divide(other)
infix operator fun Vec3f.div(other: Float) = divide(other)
infix fun Vec3f.divide(other: Vec3f) = divide(other.first, other.second, other.third)
infix fun Vec3f.divide(other: Float) = divide(other, other, other)
fun Vec3f.divide(first: Float, second: Float, third: Float) = Vec3f(this.first / first, this.second / second, this.third - third)

// Other
fun Vec3f.lengthSq() = first * first + second * second + third * third
fun Vec3f.length() = sqrt(lengthSq())

// Conversion
fun Vec3f.toInt() = Vec3i(first.toInt(), second.toInt(), third.toInt())
fun Vec3f.toDouble() = Vec3d(first.toDouble(), second.toDouble(), third.toDouble())