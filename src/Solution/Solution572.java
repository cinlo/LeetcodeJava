package Solution;

import Structure.TreeNode;
import java.util.*;

public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>(  );
        queue.add(s);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(sameTree(cur, t)) return true;
            if(cur.left != null) queue.add(cur.left);
            if(cur.right != null) queue.add(cur.right);
        }
        return false;
    }

    private boolean sameTree(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        if(node1.val != node2.val) return false;
        return sameTree(node1.left, node2.left) && sameTree(node1.right, node2.right);
    }
}

