package Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution414 {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for(Integer n: nums){
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if(max2 == null || n > max2){
                max3 = max2;
                max2 = n;
            } else if(max3 == null || n > max3){
                max3 = n;
            }
        }
        return max3 == null? max1: max3;
    }




//        /*==============version 1 =========*/
//        /* deduplication */
//        Set<Integer> numsSet = new HashSet<Integer>();
//        for(int i: nums) numsSet.add(i);
//        Integer[] numsDedup = new Integer[numsSet.size()];
//        int m = 0;
//        for(int j: numsSet) numsDedup[m++] = j;
//
//        /* initialize the result list*/
//        int n = numsDedup.length;
//        if (n == 1) return numsDedup[0];
//        if (n == 2) return Math.max(numsDedup[0], numsDedup[1]);
//
//        int[] resultList = new int[3];
//        resultList[0] = Math.max(Math.max(numsDedup[0],numsDedup[1]), numsDedup[2]);
//        resultList[2] = Math.min(Math.min(numsDedup[0],numsDedup[1]), numsDedup[2]);
//        resultList[1] = numsDedup[0] + numsDedup[1] + numsDedup[2] - resultList[0] - resultList[2];
//
//        /* comparison*/
//        System.out.println(Arrays.toString(resultList));
//        numsDedup[0] = resultList[2];
//        numsDedup[1] = resultList[2];
//        numsDedup[2] = resultList[2];
//
//        for(int ele : numsDedup){
//            if(ele > resultList[0]){
//                resultList[2] = resultList[1];
//                resultList[1] = resultList[0];
//                resultList[0] = ele;
//            }
//            else if(ele > resultList[1]){
//                resultList[2] = resultList[1];
//                resultList[1] = ele;
//            }
//            else if(ele > resultList[2]){
//                resultList[2] = ele;
//            }
//        }
//
//        return resultList[2];
//    }
//    /*==============version 1 =========*/

}
