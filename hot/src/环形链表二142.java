public class 环形链表二142 {
}
 class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null)
                fast=fast.next;
            slow=slow.next;
            if(fast==slow)
                break;

        }
        if(fast==null)
            return null;
        temp=head;
        int index=0;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
            index++;
        }
        return temp;
    }
}
