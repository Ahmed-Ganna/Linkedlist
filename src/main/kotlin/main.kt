


fun main(args: Array<String>) {

/*    val sll = SingleLinkedList()
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

    println("LLS length -> ${sll.length()}")*/


    deleteLast()
}

fun insertAtIndex() {
    val sll = SingleLinkedList()
    sll.insert(1 , 1) // 1 --> null
    sll.insert(2 , 2) // 1 --> 2
    sll.insert(1 , 3) // 3 --> 1 --> 2
    sll.insert(2 , 4) // 3 --> 4 --> 1 --> 2

    sll.display()
}

fun deleteFirst() {
    val sll = SingleLinkedList()
    sll.insertFirst(2)
    sll.insertFirst(1)
    sll.display()
    sll.deleteFirst()
    sll.display()
}

fun deleteLast() {
    val sll = SingleLinkedList()
    sll.insertFirst(2)
    sll.insertFirst(1)
    sll.display()
    sll.deleteLast()
    sll.display()
}
