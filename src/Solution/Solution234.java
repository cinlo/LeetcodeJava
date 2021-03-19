package Solution;

import Structure.ListNode;
import java.util.*;

public class Solution234 {
    public boolean isPalindrome( ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        for(int i = 0; i < list.size(); i++){
            if( !list.get(i).equals(list.get(list.size( ) - i - 1)) ) return false;
        }
        return true;
    }
}
