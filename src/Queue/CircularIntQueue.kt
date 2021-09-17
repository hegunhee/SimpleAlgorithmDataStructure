package Queue

class CircularIntQueue {
    private val max = 10
    private val que = IntArray(max)
    private var num = 0
    private var rear = 0
    private var front = 0

    fun enqueue(data : Int)  {

        if((num) >= max) {
            println("큐가 가득 찼습니다")
        }else{
            que[rear++] = data
            num++
            if(rear == max) rear = 0
        }
    }
    fun clear(){
        num = 0
        rear = 0
        front = 0
    }
    fun capacity() : Int{
        return max
    }
    fun size() : Int{
        return num
    }
    fun isEmpty() = num <= 0

    fun isFull() = num >= max

    fun dequeue() : Int{
        if(num == 0) {
            println("큐가 비었습니다.")
            return -1
        }else{
            val x = que[front++]
            num--
            if(front == max) front = 0
            return x
        }
    }
    fun peek() : Int{
        if(num == 0){
            println("큐가 비었습니다.")
            return -1
        }else{
            return que[front]
        }
    }

    fun indexOf(data : Int) : Int{
        var index = -1
        for(i in 0 until num){
            if(data == que[i]){
                index = i
            }
        }
        return index
    }
}