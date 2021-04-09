package Solution;

import java.util.*;

public class Solution917 {
    public String reverseOnlyLetters(String S) {
        char[] sArray = S.toCharArray();
        int left = 0, right = sArray.length - 1;
        StringBuilder res = new StringBuilder(  );
        while(left < right){
            while(left < right && !Character.isAlphabetic(sArray[left])) left++;
            while(left < right && !Character.isAlphabetic(sArray[right])) right--;
            if(left == right) return res.append(sArray).toString();
            char tmp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = tmp;
            left++;
            right--;
        }
        return res.append(sArray).toString();
    }
}
