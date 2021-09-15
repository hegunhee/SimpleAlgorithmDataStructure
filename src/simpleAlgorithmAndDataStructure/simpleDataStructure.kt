package simpleAlgorithmAndDataStructure

fun main(args :Array<String>) {

}
fun copy(a : IntArray, b : IntArray){
    for(i in 0 until b.size){
        a[i] = b[i]
    }
}
fun rcopy(a : IntArray, b: IntArray){
    for(i in 0 until b.size){
        a[i] = b[(b.size-1) - i]
    }

}
fun cardConv(x : Int, r: Int, d : CharArray){
    var xValue = x
    var count = d.size -1
    do{
        d[count--] = (xValue%r).toChar()
        xValue = xValue/r
    }while(x != 0)
}