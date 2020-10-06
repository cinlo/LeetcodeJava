package Solution;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int res = 0, n = nums.length;
        for(int i = 0; i < n ; i ++){
            if(nums[i] != val){
                nums[res ++] = nums[i];
            }
        }
        return res;
    }
}
