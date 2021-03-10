package Solution;

import java.util.Arrays;

public class Solution67 {
    public String addBinary(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        StringBuilder res = new StringBuilder();

        while(i >= 0 || j >= 0){
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            res.append(sum % 2);
            sum = sum/2;
        }
        if(sum!=0)res.append(sum);
        return res.reverse().toString();
    }
}
