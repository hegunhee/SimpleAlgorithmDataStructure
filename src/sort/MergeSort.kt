package sort

import extensions.tenRandomIntArray

fun main(args: Array<String>){
    mergeSort(tenRandomIntArray(),0,9)
}

fun MergeSort(a : IntArray, b : IntArray, c: IntArray) {
    var pa = 0
    var pb = 0
    var pc = 0

    while(pa < pc && pb < pc){
        c[pc++] = if(a[pa] < b[pb]) b[pb++] else a[pa++]
    }

    while(pa <a.size)
        c[pc++] = a[pa++]

    while(pb <b.size)
        c[pc++] = b[pb++]
}

fun mergeSort(a : IntArray,left : Int, right :Int){
    if(left <right){
        var i : Int
        val center = (left + right)/2
        var p = 0
        var j = 0
        var k = left

        mergeSort(a,left,center)
        mergeSort(a,center+1,right)
        i = left
        while(i <= center){
            buff[p++] = a[i]
            i++
        }

        while(i <=  right && j <p){
            a[k++] = if(buff[j] <= a[i]) buff[j++] else a[i++]
        }
        while(j<p)
            a[k++] = buff[j++]
    }
}
var buff = IntArray(10)