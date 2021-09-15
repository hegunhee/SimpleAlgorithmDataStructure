package Stack

fun main(args: Array<String>){

    val stack = Stack<Int>()

    var i = 0
    while(true){
        print("(1) 푸시 (2) 팝 (3) 피크 (4) 찾기 (0) 종료 : ")
        i = readLine()?.toInt()!!
        when(i){
            1 -> stack.push(readLine()?.toInt()!!)
            2 -> println(stack.pop())
            3 -> println(stack.peek())
            4 -> println(stack.indexOf(readLine()?.toInt()!!))
            0 -> break
        }
    }
//    val Intstack = Stack<Int>()?.apply {
//        push(3)
//        push(5)
//        push(1)
//        push(21)
//    }
//    Intstack?.let {
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//        println("pop ${it.pop()}")
//        println("size ${it.size()}")
//        println("peek ${it.peek()}")
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//        println("pop ${it.pop()}")
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//    }
//
//    val stringStack = Stack<String>()?.apply {
//        push("Kotlin")
//        push("Java")
//        push("MySql")
//        push("Python")
//    }
//    stringStack?.let {
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//        println("pop ${it.pop()}")
//        println("size ${it.size()}")
//        println("peek ${it.peek()}")
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//        println("pop ${it.pop()}")
//        println("size ${it.size()}")
//        println("pop ${it.pop()}")
//    }
}