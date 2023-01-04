public class 排序链表148 {
}
class Solution148 {
    public ListNode sortList(ListNode head) {
        if(head==null)
            return head;
        int length=0;
        ListNode node=head;
        while(node!=null){
            length++;
            node=node.next;
        }
        ListNode dummy=new ListNode(0,head);
        for(int sublen=1;sublen<length;sublen*=2){
            ListNode pre=dummy;
            ListNode cur=dummy.next;
            while(cur!=null){
                ListNode head1=cur;
                for(int i=1;i<sublen&&cur.next!=null;i++)
                    cur=cur.next;
                ListNode head2=cur.next;
                cur.next=null;
                cur=head2;
                for(int i=1;i<sublen&&cur!=null&&cur.next!=null;i++)
                    cur=cur.next;
                ListNode next=null;
                if(cur!=null){
                    next=cur.next;
                    cur.next=null;
                }
                cur=next;
               pre.next= merge(head1,head2);
               while(pre.next!=null)
                   pre=pre.next;
            }
        }
        return dummy.next;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode l3=new ListNode();
        ListNode temp3=l3;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val>=temp2.val){
                temp3.next=temp2;
                temp2=temp2.next;
            }else{
                temp3.next=temp1;
                temp1=temp1.next;
            }
            temp3=temp3.next;
        }
        if(temp1!=null){
            temp3.next=temp1;
        }
        if(temp2!=null){
            temp3.next=temp2;
        }
        return l3.next;
    }
}
