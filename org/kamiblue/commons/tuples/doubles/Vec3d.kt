package org.kamiblue.commons.tuples.floats

import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.ints.Vec3i
import kotlin.math.sqrt

typealias Vec3d = Vec3<Double>
val VEC3D_ZERO = Vec3d(0.0, 0.0, 0.0)

// Addition (+)
infix operator fun Vec3d.plus(other: Vec3d) = add(other)
infix operator fun Vec3d.plus(other: Double) = add(other)
infix fun Vec3d.add(other: Vec3d) = add(other.first, other.second, other.third)
infix fun Vec3d.add(other: Double) = add(other, other, other)
fun Vec3d.add(first: Double, second: Double, third: Double) = Vec3d(this.first + first, this.second + second, this.third + third)

// Subtraction (-)
infix operator fun Vec3d.minus(other: Vec3d) = subtract(other)
infix operator fun Vec3d.minus(other: Double) = subtract(other)
infix fun Vec3d.subtract(other: Vec3d) = subtract(other.first, other.second, other.third)
infix fun Vec3d.subtract(other: Double) = subtract(other, other, other)
fun Vec3d.subtract(first: Double, second: Double, third: Double) = Vec3d(this.first - first, this.second - second, this.third - third)

// Multiplication (*)
infix operator fun Vec3d.times(other: Vec3d) = multiply(other)
infix operator fun Vec3d.times(other: Double) = multiply(other)
infix fun Vec3d.multiply(other: Vec3d) = multiply(other.first, other.second, other.third)
infix fun Vec3d.multiply(other: Double) = multiply(other, other, other)
fun Vec3d.multiply(first: Double, second: Double, third: Double) = Vec3d(this.first * first, this.second * second, this.third - third)

// Division (/)
infix operator fun Vec3d.div(other: Vec3d) = divide(other)
infix operator fun Vec3d.div(other: Double) = divide(other)
infix fun Vec3d.divide(other: Vec3d) = divide(other.first, other.second, other.third)
infix fun Vec3d.divide(other: Double) = divide(other, other, other)
fun Vec3d.divide(first: Double, second: Double, third: Double) = Vec3d(this.first / first, this.second / second, this.third - third)

// Other
fun Vec3d.lengthSq() = first * first + second * second + third * third
fun Vec3d.length() = sqrt(lengthSq())

// Conversion
fun Vec3d.toInt() = Vec3i(first.toInt(), second.toInt(), third.toInt())
fun Vec3d.toFloat() = Vec3f(first.toFloat(), second.toFloat(), third.toFloat())