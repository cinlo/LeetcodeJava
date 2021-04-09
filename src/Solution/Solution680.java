package Solution;

public class Solution680 {
    boolean deleted = false;
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                if(deleted) return false;
                deleted = true;
                String subStr1 = s.substring(i + 1, j + 1);
                String subStr2 = s.substring(i, j);
                return validPalindrome(subStr1) || validPalindrome(subStr2);
            }
            i++;
            j--;
        }
        return true;
    }
}
