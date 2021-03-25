package Solution;

import java.util.*;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> res = new ArrayList<String>();
        while(i <= n){
            String tmp = "";
            if(i % 3 == 0) tmp = tmp + "Fizz";
            if(i % 5 == 0) tmp = tmp + "Buzz";
            if(i % 3 != 0 && i % 5 != 0) tmp = tmp + i;
            res.add(tmp);
            i++;
        }
        return res;
    }
}
