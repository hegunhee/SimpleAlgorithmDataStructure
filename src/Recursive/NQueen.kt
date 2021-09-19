package Recursive

import kotlin.math.abs

fun main(args : Array<String>) {
    val finalResult : MutableList<List<Int>> = mutableListOf()
    nQueen(4,0, mutableListOf(), finalResult)
}

fun nQueen(N : Int,current_row : Int, current_candidate : MutableList<Int>,finalResult: MutableList<List<Int>> ) {
    if( N == current_row){
        finalResult.add(current_candidate)
        println(current_candidate)
        return
    }

    for(i in 0 until N){
        if(isAvailable(current_candidate.toIntArray(),i)){
            current_candidate.add(i)
            nQueen(N,current_row+1,current_candidate,finalResult)
            current_candidate.removeLast()
        }
    }

}

fun isAvailable(candidate: IntArray,current_col : Int) : Boolean{
    for(i in candidate.indices)
        if(candidate[i] == current_col || (abs(candidate[i] - current_col) == (candidate.size) -i ))
            return false
    return true
}