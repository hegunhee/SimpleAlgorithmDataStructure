package sort

import extensions.tenRandomIntArray

fun main(args :Array<String>){
    selectSort()
}

fun selectSort(arr : IntArray = tenRandomIntArray()){
    var min = 0
    var temp = 0
    arr.forEach { print("$it ") }
    println()
    for(i in arr.indices){
        min = i
        for(j in (i+1) until arr.size) {
            if(arr[min] > arr[j]){
                min = j
            }
        }
        temp = arr[min]
        arr[min] = arr[i]
        arr[i] = temp
    }
    arr.forEach { print("$it ") }
}
