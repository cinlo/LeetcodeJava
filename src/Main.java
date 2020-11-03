import Solution.Solution228;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Solution228 solution = new Solution228();
        int[] nums = {0,1,2,4,5,7};

//        *** if return an array
//        int[] res = solution.sortArrayByParity(nums);
//        System.out.println(Arrays.toString(res));

//        *** if return printable
        System.out.println(solution.summaryRanges(nums));


//        solution.moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));

    }
}