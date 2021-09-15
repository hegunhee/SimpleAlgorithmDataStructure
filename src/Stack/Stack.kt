package Stack

class Stack<T>() : BaseStack<T> {

    private val storage: MutableList<T> = mutableListOf()
    override fun push(data: T) {
        storage.add(data)
    }

    override fun pop(): T? {
        if (storage.size == 0) {
            return null
        } else {
            return storage.removeLast()
        }
    }


    override fun size(): Int {
        return storage.size
    }

    override fun peek(): T? {
        if (storage.size == 0) {
            return null
        } else {
            return storage[this.size() - 1]
        }
    }

    override fun indexOf(data: T): Int {
        if (storage.indexOf(data) == 0) {
            return -1
        } else {
            return storage.indexOf(data)
        }
    }

    override fun clear() {
        storage.clear()
    }

    override fun isEmpty(): Boolean = this.size() == 0
}