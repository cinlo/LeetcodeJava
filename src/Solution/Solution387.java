package Solution;

import java.util.*;

public class Solution387 {
    public int firstUniqChar(String s) {
        int[] charArr = new int[26];
        for(int i = 0; i < s.length(); i++)
            charArr[s.charAt(i) - 'a'] +=1;
        for(int m = 0; m < s.length(); m++)
            if(charArr[s.charAt(m) - 'a'] == 1) return m;
        return -1;
    }
}
