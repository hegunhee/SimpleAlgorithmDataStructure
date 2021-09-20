package sort

import kotlin.random.Random

fun main(args: Array<String>){
    val random = Random
    val arr = IntArray(10){
        random.nextInt(100)
    }
    reverseBubbleSort(arr)
}

//fun insertSort(arr : IntArray){
//    var temp = 0
//    arr.forEach { print("$it ")  }
//    println()
//    for(i in 0 until (arr.size -1)){
//        for(j in i until (arr.size-i)){
//            if(arr[i] > arr[j]){
//                temp = arr[i]
//                arr[i] = arr[j]
//                arr[j] = temp
//            }
//        }
//    }
//    arr.forEach { print("$it ")  }
//}

fun reverseBubbleSort(arr : IntArray){
    var temp = 0
    arr.forEach { print("$it ") }
    for(i in 0 until (arr.size)){
        for(j in (arr.size-1) downTo (i+1)){
            print("$j")
            if(arr[j-1] > arr[j]){
                temp = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = temp
            }
        }
    }
    arr.forEach { print("$it ") }
}