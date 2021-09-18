package Recursive

tailrec fun gcd(x : Int, y : Int) : Int{
    return if(y == 0){
        return x
    }else{
        return gcd(y, x%y)
    }
}