package extensions

import kotlin.random.Random

fun nextInt() = readLine()?.toInt() ?: 0

fun tenRandomIntArray() : IntArray = IntArray(10){ Random.nextInt(100)}