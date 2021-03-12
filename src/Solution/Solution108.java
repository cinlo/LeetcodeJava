package Solution;

import Structure.TreeNode;

public class Solution108{
    public TreeNode sortedArrayToBST(int[] nums){
        int len = nums.length;
        if(len == 0) return null;
        TreeNode root = helper(nums,0, len -1);
        return root;
    }

    public TreeNode helper(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}



//
//public class Solution108 {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        int len = nums.length;
//        int middle = len/2;
//
//        if(len == 1) return new TreeNode(nums[0]);
//        if(len < 4) {
//            TreeNode root = new TreeNode(nums[1]);
//            root.left = new TreeNode(nums[0]);
//            if(len == 3) root.right = new TreeNode(nums[2]);
//            return root;
//        }
//
//        TreeNode root = new TreeNode(nums[middle]);
//        int[] left = new int[middle];
//        for (int i = 0; i < middle; i++) left[i] = nums[i];
//        int[] right = new int[len - middle - 1];
//        for(int j = 0; j < (len - middle - 1); j++) right[j] = nums[middle + j + 1];
//
//        root.left = sortedArrayToBST(left);
//        root.right = sortedArrayToBST(right);
//
//        return root;
//    }
//}
