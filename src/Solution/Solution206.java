package Solution;

import Structure.ListNode;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode tail = head;

        while(tail.next != null){
            ListNode newHead = tail.next;
            tail.next = tail.next.next;
            newHead.next = head;
            head = newHead;
        }

        return head;
    }
}
