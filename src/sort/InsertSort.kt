package sort

import extensions.tenRandomIntArray

fun main(args :Array<String>){
    insertSort()
}

fun insertSort(arr : IntArray = tenRandomIntArray()){
    arr.forEach { print("$it ")}
    println()
    for(i in 1 until arr.size){
        var j = i
        val temp = arr[i]
        while(j > 0 && arr[j-1] > temp){
            arr[j] = arr[j-1]
            j--
        }
        arr[j] = temp
    }
    arr.forEach { print("$it ") }
}