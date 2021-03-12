package Solution;

import Structure.TreeNode;

public class Solution110{
    public boolean isBalanced( TreeNode root ){
        return helper(root) != -1;
    }

    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}


//import Structure.TreeNode;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Solution110 {
//    public boolean isBalanced( TreeNode root) {
//        if(root == null || (root.left == null & root.right == null)) return true;
//        Queue<TreeNode> queue = new LinkedList<TreeNode>(  );
//        queue.offer(root);
//
//        while(!queue.isEmpty()){
//            TreeNode temp = queue.poll();
//            int left = 0, right = 0;
//            if(temp.left != null) {
//                queue.offer(temp.left);
//                left = helper(temp.left);
//            }
//            if(temp.right != null) {
//                queue.offer(temp.right);
//                right = helper(temp.right);
//            }
//            if(Math.abs(left - right) > 1) return false;
//        }
//        return true;
//    }
//
//    public int helper (TreeNode root){
//        if(root.left == null && root.right == null) return 1;
//        if(root.left == null) return helper(root.right) + 1;
//        if(root.right == null) return helper(root.left) + 1;
//        return Math.max(helper(root.left), helper(root.right)) + 1;
//    }
//}
