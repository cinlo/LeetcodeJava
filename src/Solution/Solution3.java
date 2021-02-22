package Solution;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s){
        int l = s.length();
        if(l == 0) return 0;
        if(l == 1) return 1;

        int i = 0, j = 1, max = 1, cur = 1;
        HashMap<Character, Integer> uniChar = new HashMap<Character, Integer>();
        uniChar.put(s.charAt(0),0);

        while(j < l){
            if(uniChar.containsKey(s.charAt(j))){
                i = Math.max(uniChar.get(s.charAt(j)) + 1, i);
                uniChar.put(s.charAt(j),j);
                max = Math.max(max,cur);
                cur = j - i + 1;
            }
            else{
                uniChar.put(s.charAt(j),j);
                cur++;
            }
            j ++;
        }

        max = Math.max(max,cur);
        return max;
    }
}
