import Solution.Solution859;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Solution859 solution = new Solution859();
        String A = "ab";
        String B = "ba";

//        *** if return an array
//        int[] res = solution.replaceElements(nums);
//        System.out.println(Arrays.toString(res));


        System.out.println(solution.buddyStrings(A, B));


    }
}