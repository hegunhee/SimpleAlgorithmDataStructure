package List


fun main(args :Array<String>){
    val list = LinkedList<Int>(Node<Int>(3))
    list.addFirst(Node(2))
    list.addTail(Node(6))
    list.addTail(Node(9))
    list.readAll()
    println()
    list.addFirst(Node(10))
    list.readAll()
    println()
    list.removeFirst()
    list.readAll()
    println()
    list.removeTail()
    list.readAll()
    list.readAll()
}
class LinkedList<T>(node : Node<T>) {
    private var head : Node<T>? = node
    private var crnt : Node<T> = node
    fun isEmpty() : Boolean{
        return head == null
    }

    fun search(data : T) : T?{
        var ptr = head
        while(ptr != null){
            if(ptr?.data == data)
                return ptr.data
            ptr = ptr.next
        }
        return null
    }

    fun addFirst(node : Node<T>){
        if(head == null){
            head = node
            return
        }
        node.next = head
        head = node
    }

    fun addTail(node : Node<T>){
        if(head == null)
            addFirst(node)
        else{
            var ptr = head
            while(ptr?.next != null){
                ptr = ptr.next
            }
            ptr?.next = node
        }

    }

//    fun remove(data : T){
//        if(head != null){
//            if(head?.data == data){
//                head = head?.next
//            }
//            var ptr = head
//            var pre = head
//            while(ptr?.next != null){
//                if(ptr.data == data){
//                   pre?.next = ptr.next
//                }
//                pre = ptr
//                ptr = ptr?.next
//
//            }
//            if(pre?.data == data){
//                pre?.next = null
//            }
//        }
//    }
    fun removeFirst(){
        if(head != null){
            head = head?.next
        }
        return
    }
    fun removeTail(){
        var pre = head
        var ptr = head
        while(ptr?.next != null){
            pre = ptr
            ptr = ptr.next
        }
        pre?.next = null
    }
    fun readAll() {
        var ptr = head
        while (ptr != null){
            println(ptr.data)
            ptr = ptr.next
        }
    }

}


class Node<T>(public val data : T, public var next : Node<T>? = null){
}