
class SingleLinkedList{

    var head : ListNode ? = null

    class ListNode(val data : Int , var next : ListNode? = null)

    fun display() {
        var current  = head
        while ( current!=null ){
            print("${current.data} -->")
            current = current.next
        }
        print("null")
    }

    fun length(): Int {
        if (head ==null) return 0

        var count = 0
        var current  = head
        while ( current!=null ){
            count++
            current = current.next
        }
        return count
    }

    fun insertFirst(data: Int) {
        val item = ListNode(data,head)
        head = item
    }

    fun insertLast(data: Int) {
        val item = ListNode(data)
        if (head ==null){
            head = item
            return
        }
        var current = head
        while (current?.next!=null){
            current = current.next
        }
        current?.next = item
    }

    fun insert(position: Int, value: Int) {

        val node = ListNode(value)
        if (position ==1 ){
            node.next = head
            head = node
        }else{
            //1 --> 2 --> 3
            //1 --> 4 --> 2 --> 3
            var previous = head
            var count = 1
            while (count < position-1){
                previous = previous?.next
                count++
            }
            node.next = previous?.next
            previous?.next = node
        }
    }

}

fun main(args: Array<String>) {

    val sll = SingleLinkedList()
    sll.head = SingleLinkedList.ListNode(3)
    val second = SingleLinkedList.ListNode(4)
    val third = SingleLinkedList.ListNode(5)
    val fourth = SingleLinkedList.ListNode(7)

    sll.head?.next = second
    second.next = third
    third.next = fourth

    sll.insertFirst(11)
    sll.insertFirst(8 )
    sll.insertFirst(1 )

    sll.insertLast(12 )

    sll.display()

    println("LLS length -> ${sll.length()}")


}

fun insertAtIndex() {
    val sll = SingleLinkedList()
    sll.insert(1 , 1) // 1 --> null
    sll.insert(2 , 2) // 1 --> 2
    sll.insert(1 , 3) // 3 --> 1 --> 2
    sll.insert(2 , 4) // 3 --> 4 --> 1 --> 2

    sll.display()
}
