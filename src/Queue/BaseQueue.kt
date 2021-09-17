package Queue

interface BaseQueue<T> {


    fun enqueue(data : T)

    fun dequeue() : T

    fun peek() : T

    fun indexOf(data : T) : Int

    fun clear()

    fun isEmpty() : Boolean

}