package Solution;

import Structure.TreeNode;

public class Solution270 {
    public int closestValue( TreeNode root, double target) {
        int upper = root.val, lower = root.val;
        while(root != null){
            if(target == root.val) return root.val;
            if(target < root.val){
                upper = root.val;
                root = root.left;
            }
            else{
                lower = root.val;
                root = root.right;
            }
        }
        System.out.println(lower);

        if(Math.abs(lower - target) > Math.abs(upper - target)) return upper;
        else return lower;

    }
}
