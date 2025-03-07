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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        while (true) {
            ListNode kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) break;
            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kthNode.next;
            reverseGroup(groupStart, kthNode);
            prevGroupEnd.next = kthNode;
            groupStart.next = nextGroupStart;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
    private ListNode getKthNode(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }
    private void reverseGroup(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode curr = start;
        ListNode next = null;
        
        while (prev != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
