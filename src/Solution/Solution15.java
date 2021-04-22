package Solution;

import java.util.*;

public class Solution15 {
    public List<List<Integer>> threeSum( int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>(  );
        if(nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) return res;

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] + nums[i] == 0){
                    List<Integer> tmp = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(tmp);
                    while((left + 1) < right && nums[left + 1] == nums[left]) left++;
                    left++;
                }
                if(nums[left] + nums[right] + nums[i] > 0) right--;
                if(nums[left] + nums[right] + nums[i] < 0) left++;
            }
        }
        return res;
    }
}


