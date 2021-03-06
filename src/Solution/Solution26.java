package Solution;

public class Solution26{
    public int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;

        int cur = nums[0], res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != cur){
                cur = nums[i];
                nums[res] = cur;
                res++;
            }
        }
        return res;
    }
}



//public class Solution26 {
//    public int removeDuplicates(int[] nums) {
//        if(nums.length == 0){return 0;}
//
//        int begin = 1, cur = nums[0], n = nums.length;
//        for(int i = 1; i < n; i ++){
//            if(nums[i] != cur){
//                cur = nums[i];
//                nums[begin++] = cur;
//            }
//        }
//        return begin;
//    }
//}
