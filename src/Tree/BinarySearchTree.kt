package Tree

class BinarySearchTree<K, V>() {

    fun search(key: K): V? {
        var p: Node<K, V> = root ?: return null
        while (true) {
            if (p.getKey() == key) {
                return p.getValue()
            } else if (p.getKey() > key) {
                p = p.left!!
            } else if (p.getKey() < key) {
                p = p.right!!
            }
        }
    }

    fun add(key: K, data: V) {
        if (root == null)
            root = Node<K, V>(key, data)
        var p = root
        val node = Node<K, V>(key, data)
        while (true) {
            if (p?.getKey() > node.getKey()) {
                if (p?.left == null)
                    p?.left = node
                else
                    p = p.left
            } else if (p?.getKey() == node.getKey())
                return
            else {
                if (p?.right == null)
                    p?.right = node
                else
                    p = p?.right
            }
        }
    }


    private var root: Node<K, V>? = null
}

private operator fun <K> Any?.compareTo(key: K): Int {
    return if (this > key) {
        1
    } else {
        0
    }

}


class Node<K, V>(
    private val key: K,
    private val data: V,
    var left: Node<K, V>? = null,
    var right: Node<K, V>? = null
) {
    fun getKey() = key

    fun getValue() = data

    fun print() {
        println(data)
    }

}