package Solution;

import Structure.TreeNode;

public class Solution104 {
    public int maxDepth( TreeNode root){
        // base case;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
}
