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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null ){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null ){
            slow = slow.next;
        }
        while(prev.next != slow){
            prev = prev.next;    
        }
        prev.next = slow.next;
    return head;
    }
}