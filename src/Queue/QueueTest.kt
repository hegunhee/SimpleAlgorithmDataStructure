package Queue

import extensions.nextInt

fun main(args : Array<String>){
    var index = 0
    val queue = Queue<Int>()
    while(true) {
        println("1. enqueue 2.dequeue 3.peek 4.indexOf 5.exit")
        index = nextInt()
        when(index){
            1 -> queue.enqueue(nextInt())
            2 -> println(queue.dequeue())
            3 -> println(queue.peek())
            4 -> println(queue.indexOf(nextInt()))
            5 -> break
        }
    }
}