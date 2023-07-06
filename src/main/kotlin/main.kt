


fun main(args: Array<String>) {

    containsLoops()

}

fun search() {
    val sll = SingleLinkedList()
    val head =  SingleLinkedList.ListNode(3)
    sll.head =head
    val second = SingleLinkedList.ListNode(4)
    val third = SingleLinkedList.ListNode(5)

    sll.head?.next = second
    second.next = third

    print(sll.find(10))
}

fun reverse() {
    val sll = SingleLinkedList()
    sll.insert(1 , 1)
    sll.insert(2 , 2)
    sll.insert(3 , 3)
    sll.insert(4 , 4)

    sll.reverse()

    sll.printLinkedList()
}



fun insertAtIndex() {
    val sll = SingleLinkedList()
    sll.insert(1 , 1) // 1 --> null
    sll.insert(2 , 2) // 1 --> 2
    sll.insert(1 , 3) // 3 --> 1 --> 2
    sll.insert(2 , 4) // 3 --> 4 --> 1 --> 2

    sll.printLinkedList()
}

fun getMiddleNode() {
    val sll = SingleLinkedList()
    sll.insertFirst(1)
    sll.insertFirst(2)
    sll.insertFirst(3)
    sll.insertFirst(5)
    sll.insertFirst(8)
    sll.insertFirst(7)
    sll.insertFirst(9)

    print("Middle node is :" + sll.getMiddleNode()?.data)
}

fun removeDuplicates() {
    val sll = SingleLinkedList()
    sll.insert(1 , 1) // 1 --> null
    sll.insert(2 , 2) // 1 --> 2
    sll.insert(1 , 3) // 3 --> 1 --> 2
    sll.insert(2 , 3) // 3 --> 4 --> 1 --> 2
    sll.printLinkedList()
    sll.removeDuplicates()
    sll.printLinkedList()
}

fun deleteFirst() {
    val sll = SingleLinkedList()
    sll.insertFirst(2)
    sll.insertFirst(1)
    sll.printLinkedList()
    sll.deleteFirst()
    sll.printLinkedList()
}

fun deleteLast() {
    val sll = SingleLinkedList()
    sll.insertFirst(2)
    sll.insertFirst(1)
    sll.printLinkedList()
    sll.deleteLast()
    sll.printLinkedList()
}

fun deleteKey() {
    val sll = SingleLinkedList()
    sll.insertFirst(2)
    sll.insertFirst(1)
    sll.printLinkedList()
    sll.deleteKey(2)
    sll.printLinkedList()
}

fun deleteAtPosition() {
    val sll = SingleLinkedList()
    sll.insertLast(1)
    sll.insertLast(2)
    sll.insertLast(3)
    sll.delete(2)
    sll.printLinkedList()
}

fun insertAtSortedList() {
    val sll = SingleLinkedList()
    sll.insertFirst(16)
    sll.insertFirst(10)
    sll.insertFirst(8)
    sll.insertFirst(1)
    sll.printLinkedList()
    sll.insertInSortedList(11)
    sll.printLinkedList()
}

fun containsLoops() {
    val sll = SingleLinkedList()
    sll.createALoopIntoLinkedList()
    print("Contains loops:"+sll.containsLoop())
}

