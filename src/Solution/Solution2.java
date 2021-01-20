package Solution;
import Structure.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0, v1,v2,val;
        while(l1 != null || l2 != null || carry != 0){
            if(l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            else v1 = 0;

            if(l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            else v2 = 0;

            val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }
}
