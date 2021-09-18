package Recursive

fun main(args : Array<String>){
    recur2(4)

}
fun recur2(n : Int){
    if(n>0){
        recur2(n-2)
        println(n)
        recur2(n-1)
    }
}