package Set

class Set(private val max : Int) {
    private var num : Int = 0
    private val set = IntArray(max)
    
    fun add(data : Int){
        if(!contains(data) && num < max){
            set[num++] = data
        }
    }

    private fun contains(n: Int) :Boolean {
        for(i in 0 until num){
            if(n == set[i])
                return true
        }
        return false
    }

    fun size() = num

    fun capacity() = max

    fun indexOf(n : Int) : Int{
        for(i in 0 until num){
            if(n == set[i])
                return i
        }
        return -1
    }

    fun remove(n : Int) {
        if(!contains(n)){
            println("해당 수는 집합에 없습니다.")
            return
        }
        if(num <= 0) return
        val index = indexOf(n)
        set[index] = set[--num]
    }

    fun copyTo(s : Set){
        val n = if (s.max < num) s.max else num
        for(i in 0 until n)
            s.set[i] = set[i]
        s.num = n
    }
    fun copyFrom(s : Set){
        val n = if (max < s.num) max else s.num
        for(i in 0 until n)
            set[i] = s.set[i]
        num = n
    }
}