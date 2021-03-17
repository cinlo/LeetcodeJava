package Solution;

public class Solution198 {
    public int rob(int[] nums){
        if(nums.length == 1) return nums[0];
        int notRob = 0, Rob = 0;

        for (int num : nums) {
            notRob=Rob;
            Rob=Math.max(notRob + num, Rob);
        }
        return Math.max(notRob, Rob);
    }
}
