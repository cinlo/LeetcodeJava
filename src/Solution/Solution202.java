package Solution;

import java.util.*;

public class Solution202 {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1){
            int cur = 0, tmp = n;
            while(n!= 0){
                cur += ( n % 10 ) * ( n % 10);
                n = n/10;
            }
            if(cur == 1) return true;
            n = cur;
            int size = set.size();
            set.add(n);
            if(size == set.size()) return false;
        }
        return false;
    }
}
