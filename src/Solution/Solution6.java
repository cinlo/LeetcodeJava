package Solution;

import java.util.Arrays;

public class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int subLen = (numRows - 1) * 2;
        StringBuilder[] resArray = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) resArray[i] = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            if(i % subLen < numRows){
                resArray[i % subLen].append(s.charAt(i));
            }
            else{
                resArray[subLen - i % subLen].append(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder(  );
        for(StringBuilder ele: resArray) res.append(ele);
        return res.toString();
    }
}
