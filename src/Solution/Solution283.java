package Solution;

public class Solution283{
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
}


//public class Solution283 {
//    public void moveZeroes(int[] nums){
//        int n = nums.length;
//        if(n < 2) return;
//        int fast, slow = 0;
//        for(fast = 0; fast < n; fast ++){
//            if(nums[fast] != 0) nums[slow++] = nums[fast];
//        }
//        for(; slow < n; slow ++){
//            nums[slow] = 0;
//        }
//    }
//}
