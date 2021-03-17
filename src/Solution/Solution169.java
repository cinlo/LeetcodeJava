package Solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution169 {
    public int majorityElement(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        Hashtable<Integer, Integer> numDic = new Hashtable<Integer, Integer>(  );

        for(int ele: nums){
            if( numDic.containsKey(ele) ) numDic.put(ele, numDic.get(ele) + 1);
            else numDic.put(ele,1);
            if(numDic.get(ele) > n/2) return ele;
        }

        return 0;
    }
}
