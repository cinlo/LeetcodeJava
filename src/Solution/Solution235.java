package Solution;

import Structure.TreeNode;

import java.util.Stack;

public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // find the first node that p & q are in left subtree and right subtree;
        while((root.val - p.val) * (root.val - q.val) > 0){
            root = p.val < root.val ? root.left : root.right;
        }
        return root;
    }
}
