package Solution;

import Structure.ListNode;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode A, ListNode B){
        if(A == null || B == null) return null;
        ListNode a = A;
        ListNode b = B;

        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? B : a.next;
            b = b == null? A : b.next;
        }
        return a;
    }
}
