package Solution;

import Structure.TreeNode;

//=============
public class Solution112{
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        if(root.left == null && root.right == null && targetSum - root.val == 0) return true;
        return hasPathSum(root.left, (targetSum - root.val)) || hasPathSum(root.right, (targetSum - root.val));
    }
}



////===============
//import java.util.*;
//
//public class Solution112 {
//    public boolean hasPathSum( TreeNode root, int targetSum) {
//        // null case
//        if(root == null) return false;
//
//        //DFS:
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        root.val = targetSum - root.val;
//        stack.push(root);
//
//        while(!stack.empty()){
//            TreeNode cur = stack.pop();
//            if(cur.right != null) {
//                cur.right.val = cur.val - cur.right.val;
//                stack.push(cur.right);
//            }
//            if(cur.left != null) {
//                cur.left.val = cur.val - cur.left.val;
//                stack.push(cur.left);
//            }
//            if(cur.left == null && cur.right == null && cur.val == 0) return true;
//        }
//        return false;
//    }
//}
