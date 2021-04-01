package Solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> res = new ArrayList<>(  );
        for(int i = 1; i < nums.length + 1; i++){
            int len = numSet.size();
            numSet.add(i);
            if( len != numSet.size()) res.add(i);
        }
        return res;
    }
}
