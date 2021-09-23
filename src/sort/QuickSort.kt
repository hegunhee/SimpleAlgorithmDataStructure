package sort

import extensions.tenRandomIntArray

fun main(args: Array<String>) {

    quickSort(tenRandomIntArray(),0, tenRandomIntArray().size-1)
}

fun pivotTest(arr: IntArray) {
    arr.forEach {
        print("$it ")
    }
    var pl = 0
    var pr = arr.size - 1
    var x = arr[arr.size / 2]

    do {
        while (arr[pl] < x) pl++
        while (arr[pr] > x) pr--
        if (pl <= pr) {
            val temp = arr[pl]
            arr[pl] = arr[pr]
            arr[pr] = temp
            pl++
            pr--
        }
    } while (pl <= pr)

    println("피벗의 값은 $x 입니다.")

    println("피벗 이하의 그룹")
    for (i in 0 until pl) {
        print("${arr[i]} ")
    }
    println()
    println("피벗 이상의 그룹")
    for (i in pr + 1 until arr.size) {
        print("${arr[i]} ")
    }
}

fun quickSort(arr: IntArray, left: Int, right: Int) {
    println()
    var pl = left
    var pr = right
    var x = arr[(pl + pr) / 2]

    do {
        while (arr[pl] < x) pl++
        while (arr[pr] > x) pr--
        if (pl <= pr) {
            val temp = arr[pl]
            arr[pl] = arr[pr]
            arr[pr] = temp
            pl++
            pr--
        }
    } while (pl <= pr)
    arr.forEach { print("$it ") }
    if(left < pr) quickSort(arr,left,pr)
    if(right > pl) quickSort(arr,pl,right)

}