import Solution.Solution905;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Solution905 solution = new Solution905();
        int[] nums = {3,1,2,4};

//        *** if return an array
        int[] res = solution.sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));

//        *** if return printable
//        System.out.println(solution.buddyStrings(A, B));


//        solution.moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));

    }
}