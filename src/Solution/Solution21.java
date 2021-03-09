package Solution;

public class Solution21 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode res = new ListNode();
            dummy = res;

            while(l1 != null && l2 != null){
                if(l1.val < l2.val) {
                    res.next = l1;
                    l1 = l1.next;
                }
                else {
                    res.next = l2;
                    l2 = l2.next;
                }
                res = res.next;
            }

            if(l1 != null) res.next = l1;
            if(l2 != null) res.next = l2;

            return dummy.next;
        }
    }
}
