package Stack

class IntStack(private val size: Int) {

    private val stack = IntArray(size)
    private var top = 0
    fun pop(data: Int) {
        if (top == size) {
            println("용량을 초과했습니다")
        } else {
            stack[top++] = data
        }
    }

    fun push(): Int =
        if (top == 0) {
            -1
        } else {
            stack[--top]
        }

    fun peek(): Int {
        if(top == 0){
            return -1
        }else{
            return stack[top -1]
        }
    }
}