package org.kamiblue.commons.tuples.operations

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.Vec4
import kotlin.math.sqrt

/* Vec2d */

typealias Vec2d = Vec2<Double>

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

/* End of Vec2d */


/* Vec3d */

typealias Vec3d = Vec3<Double>

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

/* End of Vec3d */


/* Vec4d */

typealias Vec4d = Vec4<Double>

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
fun Vec4d.lengthSq() = first * first + second * second + third * third
fun Vec4d.length() = sqrt(lengthSq())

/* End of Vec4d */