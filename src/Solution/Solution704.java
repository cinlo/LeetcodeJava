package Solution;

public class Solution704 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length, cur = end / 2;

        if(end == 1 & nums[0] != target) return -1;

        while(cur != start){
            if(nums[cur] == target){return cur;}
            if(nums[cur] > target){end = cur;}
            else{start = cur;}
            cur = (start + end)/2;
        }
        if(nums[cur] == target){return cur;}
        return -1;
    }
}
