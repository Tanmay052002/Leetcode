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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }  
       ListNode h2 =  slow.next ;
       slow.next = null;

       ListNode prev = null;
       ListNode curr = h2;

       while(curr != null){
        ListNode currpr = curr.next;
        curr.next = prev;
        prev = curr;
        curr = currpr;
       }
       h2 = prev;

       ListNode left = head;

       ListNode right = h2;

       while(right != null ){
        ListNode curr1 = left.next;
        ListNode curr2 = right.next;

        left.next = right;
        right.next = curr1;

        left = curr1;
        right = curr2;
        
       } 
    }
}
