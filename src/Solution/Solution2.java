package Solution;
import Structure.ListNode;


public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode dummy = res;
        while(l1 != null || l2 != null || carry !=0){
            int val1 = l1== null? 0: l1.val;
            if(l1!= null)l1 = l1.next;
            int val2 = l2 == null? 0: l2.val;
            if(l2!= null)l2 = l2.next;
            ListNode tmp = new ListNode((val1+val2+carry)%10);
            carry = (val1+val2+carry)/10;
            dummy.next = tmp;
            dummy = dummy.next;
        }
        return res.next;
    }
}
