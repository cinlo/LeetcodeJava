package Solution;

import java.util.*;
import java.util.stream.Collectors;


public class Solution349{
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> resList = new HashSet<Integer>(  );
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while( i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                resList.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        return resList.stream().mapToInt(a -> a).toArray();
    }
}





////============Stream
//public class Solution349 {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        List<Integer> resList = new ArrayList<>(  );
//        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
//        for(int ele: nums1Set){
//            int len = nums2Set.size();
//            nums2Set.add(ele);
//            if(nums2Set.size() == len) resList.add(ele);
//        }
//        return resList.stream().mapToInt(i -> i).toArray();
//    }
//}
