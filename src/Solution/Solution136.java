package Solution;

import java.util.HashSet;
import java.util.Set;

public class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>(  );
        for(int ele : nums){
            if(!s.add(ele)) s.remove(ele);
        }
        return s.iterator().next();
    }
}
