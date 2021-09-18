package Recursive

fun main(args:Array<String>){
    hanoi(3,1,3,2)
}
fun hanoi(n : Int,from : Int,to : Int, ast :Int){
    println("hanoi($n, $from,$to,$ast)")
    if(n == 1){
        println("$from -> $to")
        return
    }
    hanoi(n-1,from,ast,to)
    println("$from -> $to")
    hanoi(n-1,ast,to,from)
}