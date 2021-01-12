package org.kamiblue.commons.tuples.operations

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.Vec4
import kotlin.math.sqrt

/* Vec2f */

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

/* End of Vec2f */


/* Vec3f */

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
fun Vec3f.toFloat() = Vec3f(first.toFloat(), second.toFloat(), third.toFloat())
fun Vec3f.toDouble() = Vec3d(first.toDouble(), second.toDouble(), third.toDouble())

/* End of Vec3f */


/* Vec4f */

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

/* End of Vec4f */