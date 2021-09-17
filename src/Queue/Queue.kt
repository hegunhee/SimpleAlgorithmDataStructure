package Queue

class Queue<T>() :BaseQueue<T> {

    private val que : MutableList<T> = mutableListOf()

    override fun enqueue(data: T) {
        que.add(data)
    }

    override fun dequeue(): T {
        if(que.isEmpty()){
            throw NoSuchElementException("queue가 비었습니다.")
        }else{
            return que.removeFirst()
        }
    }

    override fun peek(): T {
        if(que.isEmpty()){
            throw NoSuchElementException("queue가 비었습니다.")
        }else{
            return que.first()
        }
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