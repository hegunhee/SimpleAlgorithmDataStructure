package Stack

interface BaseStack<T> {


    fun clear()
    fun push(data : T)

    fun pop() : T?

    fun size() : Int

    fun peek() : T?

    fun indexOf(data : T) : Int

    fun isEmpty() : Boolean
}