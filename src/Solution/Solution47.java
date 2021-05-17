package Solution;

import java.util.*;

public class Solution47 {
    public List<List<Integer>> permuteUnique( int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(  );
        Arrays.sort(nums);
        backTrac(res, new ArrayList<>(  ),nums, new boolean[nums.length]);
        return res;
    }

    private void backTrac( List<List<Integer>> res, List<Integer> tempList, int[]nums, boolean[] used){
        if(tempList.size() == nums.length && !res.contains(tempList)) res.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < nums.length; i++){
                if(used[i]) continue;
                tempList.add(nums[i]);
                used[i] = true;
                backTrac(res, tempList, nums, used);
                tempList.remove(tempList.size()-1);
                used[i] = false;
            }
        }
    }
}
