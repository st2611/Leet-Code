class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var current = dummy
    var l1 = list1
    var l2 = list2

    while (l1 != null && l2 != null) {
        if (l1.`val` <= l2.`val`) {
            current.next = l1
            l1 = l1.next
        } else {
            current.next = l2
            l2 = l2.next
        }
        current = current.next!!
    }

    if (l1 != null) {
        current.next = l1
    } else if (l2 != null) {
        current.next = l2
    }

    return dummy.next
}

fun printListNode(headNode: ListNode?) {
    var current = headNode
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
}

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(4)

    node1.next = node2
    node2.next = node3

    val node4 = ListNode(1)
    val node5 = ListNode(3)
    val node6 = ListNode(4)

    node4.next = node5
    node5.next = node6

    val nodeMerged = mergeTwoLists(node1, node4)

    printListNode(nodeMerged)
}