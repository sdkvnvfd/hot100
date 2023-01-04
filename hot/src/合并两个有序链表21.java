public class 合并两个有序链表21 {
    public static void main(String[] args) {
        Solution21 s21=new Solution21();
        ListNode l1=new ListNode(4,null);
        ListNode l2=new ListNode(3,l1);
        ListNode l3=new ListNode(1,l2);
        ListNode l4=new ListNode(4,null);
        ListNode l5=new ListNode(2,l4);
        ListNode l6=new ListNode(1,l5);
        ListNode res=s21.mergeTwoLists(l3,l6);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(-1);
        ListNode p3=list3;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null&&p2!=null){
            if(p1.val>p2.val){
                p3.next=p2;
                p3=p3.next;
                p2=p2.next;
            }else{
                p3.next=p1;
                p3=p3.next;
                p1=p1.next ;
            }
        }
        if(p1!=null){
            p3.next=p1;
        }
        if(p2!=null){
            p3.next=p2;
        }
        return list3.next;
    }
}
