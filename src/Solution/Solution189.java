package Solution;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) return;
        int steps = k % nums.length;
        int[] old = new int[nums.length];
        System.arraycopy(nums, 0, old,0,nums.length);

        for(int i = 0; i < nums.length; i++){
            if(i < steps) nums[i] = old[i + k + 1];
            else nums[i] = old[i - k];
        }
    }
}
