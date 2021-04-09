package Solution;

import Structure.TreeNode;
import java.util.*;

public class Solution671 {
    public int findSecondMinimumValue(TreeNode root) {
        int min1 = root.val;
        int min2 = Integer.MAX_VALUE;
        boolean updated = false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur.val > min1 && cur.val <= min2) {
                min2 = cur.val;
                updated = true;
            }
            if(cur.left != null){
                queue.add(cur.left);
                queue.add(cur.right);
            }
        }

        if(updated) return min2;
        return -1;
    }
}
