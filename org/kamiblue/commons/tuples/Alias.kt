package org.kamiblue.commons.tuples

typealias Vec2<T> = Pair<T, T>
typealias Vec3<T> = Triple<T, T, T>
typealias Vec4<T> = Quad<T, T, T, T>

// Coordinate
val <T> Vec2<T>.x get() = first
val <T> Vec2<T>.y get() = second

val <T> Vec3<T>.x get() = first
val <T> Vec3<T>.y get() = second
val <T> Vec3<T>.z get() = third
val <T> Vec3<T>.xy get() = Vec2(x, y)

val <T> Vec4<T>.x get() = first
val <T> Vec4<T>.y get() = second
val <T> Vec4<T>.z get() = third
val <T> Vec4<T>.w get() = fourth
val <T> Vec4<T>.xy get() = Vec2(x, y)
val <T> Vec4<T>.xyz get() = Vec3(first, second, third)

// Texture coordinate
val <T> Vec2<T>.u get() = first
val <T> Vec2<T>.v get() = second

// Color
val <T> Vec3<T>.r get() = first
val <T> Vec3<T>.g get() = second
val <T> Vec3<T>.b get() = third

val <T> Vec4<T>.r get() = first
val <T> Vec4<T>.g get() = second
val <T> Vec4<T>.b get() = third
val <T> Vec4<T>.a get() = fourth
val <T> Vec4<T>.rgb get() = Vec3(first, second, third)