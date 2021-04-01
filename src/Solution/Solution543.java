package Solution;


import Structure.TreeNode;

public class Solution543{
    int max;
    public int diameterOfBinaryTree( TreeNode root){
        helper(root);
        return max;
    }

    private int helper(TreeNode node){
        if(node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}



//// =============recursive
//public class Solution543 {
//    public int diameterOfBinaryTree( TreeNode root) {
//        return helper(root)[0];
//    }
//
//    public int[] helper(TreeNode node){
//        int[] res = new int[2];
//        if(node.left == null && node.right == null) return res;
//
//        int leftVal= node.left == null? 0: helper(node.left)[0];
//        int leftLevel = node.left == null? 0:helper(node.left)[1];
//        int rightVal = node.right == null? 0:helper(node.right)[0];
//        int rightLevel = node.right == null? 0:helper(node.right)[1];
//        int edge = node.left == null || node.right == null? 1:2;
//
//        res[0] = Math.max(Math.max(leftVal, rightVal),leftLevel + rightLevel + edge);
//        res[1] = Math.max(leftLevel, rightLevel) + 1;
//        return res;
//    }
//}
