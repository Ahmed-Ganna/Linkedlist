class SingleLinkedList{

    var head : ListNode ? = null

    class ListNode(val data : Int , var next : ListNode? = null)

    fun printLinkedList() {
        var current  = head
        while ( current!=null ){
            print("${current.data} --> ")
            current = current.next
        }
        println("null")
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

    fun deleteFirst() :ListNode? {
        if (head ==null) return null
        val tmp = head
        head = tmp?.next
        return tmp
    }


    fun delete(position: Int){
        //position is valid and starting from 1
        //example : 4-5-7-4-5-7

        if (position==1){
            head = head?.next
        }else{
            var previous  = head
            var count = 1
            while (count < position -1){
                previous?.next
                count++
            }
            val current = previous?.next
            previous?.next = current?.next
        }

    }

    fun deleteLast(): ListNode? {
        if (head == null || head?.next ==null) return head

        var current = head
        var previous : ListNode? = null

        while (current?.next !=null){
            previous = current
            current = current.next
        }

        previous?.next = null
        return current
    }

    fun deleteKey(key:Int){
        var current = head

        if (current !=null && current.data == key){
            head = current.next
            return
        }

        var tmp = current

        //Not reached last one or key is not found yet
        while (current !=null && current.data !=key){
            tmp = current
            current = current.next
        }

        // reached last one and key is not found
        if (current ==null) return

        tmp?.next = current.next


    }

    fun insertInSortedList(value: Int) : ListNode? {
        val newNode = ListNode(value)

        if (head ==null) return newNode

        var current = head
        var tmp : ListNode? = null

        while (current!=null && current.data < value){
            tmp = current
            current = current.next
        }

        newNode.next = current
        tmp?.next = newNode

        return head
    }

    fun reverse(): ListNode? {

        if (head==null) return head

        var current : ListNode? = head
        var next : ListNode?
        var previous : ListNode? = null

        while (current!=null){
            next = current.next
            current.next = previous
            previous = current
            current = next
        }
        head = previous

        return head
    }

    fun find(searchKey : Int) : Boolean{
        if (head ==null) return false

        var current : ListNode? = head
        while (current !=null){
            if (current.data == searchKey){
                return true
            }
            current = current.next
        }

        return false
    }

    fun removeDuplicates(){
        if (head ==null) return

        var current : ListNode? = head

        while (current?.next != null){
            if (current.data == current.next?.data){
                current.next = current.next?.next
            }else{
                current = current.next
            }
        }
    }

}