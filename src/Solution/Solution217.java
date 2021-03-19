package Solution;

import java.util.Arrays;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
