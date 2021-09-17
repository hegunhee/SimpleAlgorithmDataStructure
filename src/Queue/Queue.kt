package Queue

class Queue<T>() :BaseQueue<T> {

    private val que : MutableList<T> = mutableListOf()

    override fun enqueue(data: T) {
        que.add(data)
    }

    override fun dequeue(): T {
        return que.removeLast()
    }

    override fun peek(): T {
        return que.last()
    }

    override fun indexOf(data : T): Int {
        return que.indexOf(data)
    }

    override fun clear() {
        que.clear()
    }

    override fun isEmpty(): Boolean {
        return que.isEmpty()
    }

}