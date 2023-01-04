public class 删除链表的倒数第N个节点19 {
}
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=new ListNode(0,head);
        ListNode slow=pre;
        ListNode fast=pre;
        while(n-->0){
            fast=fast.next;
        }
        fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return pre.next;
    }
}
