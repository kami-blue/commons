package org.kamiblue.commons.extension

import kotlin.math.ceil
import kotlin.math.floor

fun Double.floorToInt() = floor(this).toInt()

fun Float.floorToInt() = floor(this).toInt()

fun Double.ceilToInt() = ceil(this).toInt()

fun Float.ceilToInt() = ceil(this).toInt()