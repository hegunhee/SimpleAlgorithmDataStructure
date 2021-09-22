package sort

import extensions.tenRandomIntArray
import kotlin.random.Random

fun main(args: Array<String>) {
    advancedBubbleSort()
}

fun reverseBubbleSort(arr: IntArray = tenRandomIntArray()) {
    var temp = 0
    var count = 0
    arr.forEach { print("$it ") }
    println()
    for (i in 0 until (arr.size)) {
        count = 0
        for (j in (arr.size - 1) downTo (i + 1)) {
            if (arr[j - 1] > arr[j]) {
                count++
                temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            }
        }
        if (count == 0) break
    }
    arr.forEach { print("$it ") }
}

fun bubbleSort(arr: IntArray=tenRandomIntArray()) {
    var temp = 0
    var count = 0
    arr.forEach { print("$it ") }
    println()
    for (i in arr.indices) {
        count = 0
        for (j in 0 until (arr.size - i - 1)) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                count++
            }

        }
        if (count == 0) break

    }
    arr.forEach { print("$it ") }
}

fun advancedBubbleSort(arr: IntArray=tenRandomIntArray()) {
    var temp = 0
    var sortedNumber = 0
    var lastNumber = 1
    arr.forEach { print("$it ") }
    println()
    while(lastNumber < arr.size -1){
        sortedNumber = arr.size -1
        for(i in (arr.size-1) downTo lastNumber){
            if(arr[i-1] > arr[i]){
                temp = arr[i]
                arr[i] = arr[i-1]
                arr[i-1] = temp
                sortedNumber = i
            }
        }
        lastNumber = sortedNumber
    }
    arr.forEach { print("$it ") }
}