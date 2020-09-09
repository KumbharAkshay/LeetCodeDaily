class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode ptr = null;
        while(current!=null){
            ptr = current.next;
            current.next = prev;
            prev = current;
            current = ptr;
        }
        head = prev;
        return head;
    }
}