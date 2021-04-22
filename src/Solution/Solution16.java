package Solution;

import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                if( total == target) return target;
                if(Math.abs(target - total) < Math.abs(target - res) ) res = total;
                if(total > target) right--;
                else left++;
            }
        }
        return res;
    }
}
