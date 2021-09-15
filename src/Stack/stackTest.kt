package Stack

fun main(args: Array<String>){
    val Intstack = Stack<Int>()?.apply {
        push(3)
        push(5)
        push(1)
        push(21)
    }
    Intstack?.let {
        println("size ${it.size()}")
        println("pop ${it.pop()}")
        println("pop ${it.pop()}")
        println("size ${it.size()}")
        println("peek ${it.peek()}")
        println("size ${it.size()}")
        println("pop ${it.pop()}")
        println("pop ${it.pop()}")
        println("size ${it.size()}")
        println("pop ${it.pop()}")
    }

    val stringStack = Stack<String>()?.apply {
        push("Kotlin")
        push("Java")
        push("MySql")
        push("Python")
    }
    stringStack?.let {
        println("size ${it.size()}")
        println("pop ${it.pop()}")
        println("pop ${it.pop()}")
        println("size ${it.size()}")
        println("peek ${it.peek()}")
        println("size ${it.size()}")
        println("pop ${it.pop()}")
        println("pop ${it.pop()}")
        println("size ${it.size()}")
        println("pop ${it.pop()}")
    }
}