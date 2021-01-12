package org.kamiblue.commons.tuples.operations

import org.kamiblue.commons.tuples.Vec2
import org.kamiblue.commons.tuples.Vec3
import org.kamiblue.commons.tuples.Vec4
import kotlin.math.sqrt

/* Vec2i */

typealias Vec2i = Vec2<Int>

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

/* End of Vec2i */


/* Vec3i */

typealias Vec3i = Vec3<Int>

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

/* End of Vec3i */


/* Vec4i */

typealias Vec4i = Vec4<Int>

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
fun Vec4i.lengthSq() = first * first + second * second + third * third
fun Vec4i.length() = sqrt(lengthSq().toDouble())

/* End of Vec4i */