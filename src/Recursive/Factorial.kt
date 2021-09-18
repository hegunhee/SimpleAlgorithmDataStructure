package Recursive

tailrec fun factorial(n : Int) : Int{
    return if(n > 0){
        n * factorial(n-1)
    }else{
        1
    }
}