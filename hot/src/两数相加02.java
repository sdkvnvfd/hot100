public class 两数相加02 {
}
class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode l3=new ListNode(0,null);
        ListNode head3=l3;
        int add=0;
        int num=0;
        while(head1!=null&&head2!=null){
            num=(head1.val+head2.val+add)%10;
            add=(head1.val+head2.val+add)/10;
            ListNode temp=new ListNode(num);
            head3.next=temp;
            head3=temp;
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            num=(head1.val+add)%10;
            add=(head1.val+add)/10;
            ListNode temp=new ListNode(num);
            head3.next=temp;
            head3=temp;
            head1=head1.next;
        }
        while(head2!=null){
            num=(head2.val+add)%10;
            add=(head2.val+add)/10;
            ListNode temp=new ListNode(num);
            head3.next=temp;
            head3=temp;
            head2=head2.next;
        }
        if(add>0){
            ListNode temp=new ListNode(add);
            head3.next=temp;
            head3=temp;
        }
        return l3.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
