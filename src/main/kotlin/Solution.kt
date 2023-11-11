/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var tmp = head
        if (tmp != null) {
            while (tmp != null) {
                if (tmp.next != null && tmp.`val` == tmp.next!!.`val`) {
                    tmp.next = tmp.next!!.next
                }
                else {
                    tmp = tmp.next
                }
            }
        }
        return head
    }
}