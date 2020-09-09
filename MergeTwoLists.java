class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1==null ? l2 : l1;
        
        return temp.next;
    }
}