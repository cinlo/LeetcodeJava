package Solution;

import java.util.HashSet;
import java.util.Set;

public class Solution859 {
    public boolean buddyStrings(String A, String B) {
        if(A.length() <= 1 || B.length()<= 1) return false;
        if(A.length() != B.length()) return false;

        int diff = 0, diffFound = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                if(diffFound == 1){
                    if(A.charAt(i) != B.charAt(diff) || B.charAt(i) != A.charAt(diff)) return false;
                }
                if(diffFound > 2) return false;
                diff = i;
                diffFound += 1;
            }
        }

        if(diffFound == 0){
            Set<Character> AString = new HashSet<Character>();
            for(char ele : A.toCharArray()){AString.add(ele);}
            return AString.size() != A.length();
        }
        return diffFound == 2;
    }
}
