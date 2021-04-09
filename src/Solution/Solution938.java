package Solution;

import Structure.TreeNode;
import java.util.*;

public class Solution938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>(  );
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == null) continue;
            if(low <= cur.val && cur.val <= high) res+=cur.val;
            if(cur.val > low) queue.add(cur.left);
            if(cur.val < high) queue.add(cur.right);
        }
        return res;
    }
}
