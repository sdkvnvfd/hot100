public class 回文链表234 {
}
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        ListNode halfNode=searchHalf(head);
        ListNode secondNode=reverseList(halfNode.next);
        ListNode l1=head;
        ListNode l2=secondNode;
        while(l2!=null){
            if(l1.val!=l2.val)
                return false;
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode node){
        ListNode pre=null;
        ListNode cur=node;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
     public ListNode searchHalf(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
     }
}
