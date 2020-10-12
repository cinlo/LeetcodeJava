package Solution;

import Structure.ListNode;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int size = 1;

        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null){
            size ++;
            fast = fast.next;
        }

        for(int n = size - k % size; n > 1; n--){
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
