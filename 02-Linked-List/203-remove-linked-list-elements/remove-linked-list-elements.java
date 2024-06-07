/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
            ListNode sentinel = new ListNode(-1);
            sentinel.next = head;
            ListNode prev = sentinel;
            ListNode current = head;

            while (current != null) {
                ListNode next = current.next;
                if (current.val == val) {
                    prev.next = next;
                    current.next = null;
                } else {
                    prev = current;
                }

                current = next;
            }

            return sentinel.next;
        }
}