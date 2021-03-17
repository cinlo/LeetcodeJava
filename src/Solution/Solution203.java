package Solution;

import Structure.ListNode;

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        if(head == null) return null;

        ListNode dummy = head;
        while(dummy != null && dummy.next != null){
            while(dummy.next != null && dummy.next.val == val) dummy.next = dummy.next.next;
            dummy = dummy.next;
        }
        return head;
    }
}
