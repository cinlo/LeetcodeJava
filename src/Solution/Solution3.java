package Solution;

import java.util.HashMap;



public class Solution3{
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 | s.length() == 1) return s.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int start = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if( hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))>=start ) {
                res=Math.max(res, i - start);
                start=i;
            }
            hm.put(s.charAt(i),i);
        }
        return Math.max(res,s.length() - start);
    }
}

////====1 time
//public class Solution3 {
//    public int lengthOfLongestSubstring(String s){
//        int l = s.length();
//        if(l == 0) return 0;
//        if(l == 1) return 1;
//
//        int i = 0, j = 1, max = 1, cur = 1;
//        HashMap<Character, Integer> uniChar = new HashMap<Character, Integer>();
//        uniChar.put(s.charAt(0),0);
//
//        while(j < l){
//            if(uniChar.containsKey(s.charAt(j))){
//                i = Math.max(uniChar.get(s.charAt(j)) + 1, i);
//                uniChar.put(s.charAt(j),j);
//                max = Math.max(max,cur);
//                cur = j - i + 1;
//            }
//            else{
//                uniChar.put(s.charAt(j),j);
//                cur++;
//            }
//            j ++;
//        }
//
//        max = Math.max(max,cur);
//        return max;
//    }
//}
