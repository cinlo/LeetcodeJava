package Solution;
import Structure.ListNode;

public class Solution83 {
    public ListNode deleteDuplicates( ListNode head ) {
        if(head == null) return head;
        ListNode dummy = new ListNode( );
        ListNode temp = new ListNode( );
        dummy = head;
        temp = head;

        while ( dummy.next != null & temp.next != null ) {
            int cur = dummy.val;
            if ( cur != temp.next.val ) {
                dummy.next = temp.next;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        dummy.next = null;
        return head;
    }
}

