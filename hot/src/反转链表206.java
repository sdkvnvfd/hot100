public class 反转链表206 {
}
class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode dummy=head;
        if(dummy==null)
            return dummy;
        while(dummy.next!=null){
            ListNode temp=dummy.next;
            dummy.next=pre;
            pre=dummy;
            dummy=temp;
        }
        dummy.next=pre;
        return dummy;
    }
}
