public class 相交链表160 {
}
 class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            lenB++;
        }
        if(lenB>lenA){
            ListNode temp=new ListNode();
            temp=headA;
            headA=headB;
            headB=temp;
            int tempLen=lenA;
            lenA=lenB;
            lenB=tempLen;
        }
        int sublen=lenA-lenB;
        tempA=headA;
        tempB=headB;
        while(sublen-->0){
            tempA=tempA.next;
        }
        while(tempB!=null){
           if(tempA==tempB)
               return tempA;
           tempA=tempA.next;
           tempB=tempB.next;
        }
        return null;
    }
}
