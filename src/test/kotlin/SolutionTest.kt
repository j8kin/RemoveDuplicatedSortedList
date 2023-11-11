import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    private final var solution = Solution()

    private fun createList(array: IntArray): ListNode? {
        var head: ListNode? = null
        var tmp: ListNode? = null
        for (el in array) {
            if (head == null) {
                head = ListNode(el)
                tmp = head
            } else {
                tmp!!.next = ListNode(el)
            }
        }

        return head
    }

    private fun toArray(listNode: ListNode?): IntArray {
        if (listNode == null)
            return intArrayOf()
        var head = listNode
        val ret: IntArray = IntArray(5)
        var i = 0
        while (head != null) {
            ret[i] = listNode.`val`
            i++
            head = head.next
        }
        return ret
    }

    @Test
    fun deleteDuplicates1() {
        assertArrayEquals(intArrayOf(1,0,0,0,0), toArray(solution.deleteDuplicates(createList(intArrayOf(1, 1, 1)))))
    }
}