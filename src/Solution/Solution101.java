package Solution;

import Structure.TreeNode;

public class Solution101 {
    public boolean isSymmetric( TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return subIsSymmertric(left, right);
    }

    public boolean subIsSymmertric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null ) return false;
        if(left.val == right.val){
            return subIsSymmertric(left.left,right.right) && subIsSymmertric(left.right,right.left);
        }
        return false;
    }
}
