/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }
            
            ListNode current = head;
            Set<ListNode> set = new HashSet<>();
            
            while (current != null) {
                if (set.contains(current)) {
                    return current;
                }
                set.add(current);
                current = current.next;
            }
            
            return null;
        }
}