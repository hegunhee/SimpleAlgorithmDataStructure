package sort

import extensions.eightRandomIntArray
import extensions.tenRandomIntArray

fun main(args: Array<String>) {
    shellSort2()
}

fun shellSort(arr: IntArray = tenRandomIntArray()) {
    arr.forEach { print("$it ") }
    println()
    var h = arr.size / 2
    var n = arr.size
    while (h > 0) {
        for (i in h until n) {
            val temp = arr[i]
            var j = i - h
            while (j >= 0 && arr[j] > temp) {
                arr[j + h] = arr[j]
                j -= h
            }
            arr[j + h] = temp
        }
        h /= 2
    }
    arr.forEach { print("$it ") }
}

fun shellSort2(arr: IntArray = tenRandomIntArray()) {
    arr.forEach { print("$it ") }
    println()
    var h = 1
    while (h < arr.size / 9)
        h = (h * 3) + 1
    while (h > 0) {
        for (i in h until arr.size) {
            var j = i - h
            val temp = arr[i]
            while(j >= 0 && arr[j] > temp){
                arr[j+h] = arr[j]
                j -= h
            }
            arr[j+h] = temp
        }
        h /= 3
    }
    arr.forEach { print("$it ") }

}