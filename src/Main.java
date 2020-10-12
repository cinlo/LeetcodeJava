import Solution.Solution1299;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Solution1299 solution = new Solution1299();
        int[] nums = {0,3,2,1};
        int[] res = solution.replaceElements(nums);
        System.out.println(Arrays.toString(res));
    }
}