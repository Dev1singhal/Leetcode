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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=head;
        
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode even=head.next;
        ListNode evenstart=head.next;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenstart;
        return head;
        }
    }
