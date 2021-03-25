package Solution;

import java.util.*;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> resList = new ArrayList<Integer>(  );

        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                resList.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]) j ++;
            else i++;
        }
        return resList.stream().mapToInt(a -> a).toArray();
    }
}
