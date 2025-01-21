class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            countMap.put(current.val, countMap.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        ListNode dummy = new ListNode(0); 
        ListNode newList = dummy; 
        current = head;
        while (current != null) {
            if (countMap.get(current.val) == 1) {
                newList.next = new ListNode(current.val);
                newList = newList.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
