public class 环形链表141 {
}
 class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            fast=fast.next;
            if(fast.next!=null)
                fast=fast.next;
            if(fast==slow)
                return true;
            slow=slow.next;
        }
        return false;
    }
}
