package Queue

fun main(args: Array<String>){
    val queue = CircularIntQueue()

    queue?.let {
        it.enqueue(3)
        it.enqueue(5)
        it.enqueue(1)
        println(it.indexOf(3))
        println(it.indexOf(4))
        println(it.dequeue())
        println(it.dequeue())
        println(it.peek())
        println(it.dequeue())
        println(it.dequeue())

    }
}