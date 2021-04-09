package Solution;

public class Solution796 {
    public boolean rotateString(String A, String B) {
        if(A.length() == 0 && B.length() == 0) return true;
        if(A.length() != B.length()) return false;
        int len = A.length();
        for(int i = 0; i < len; i++){
            if(A.substring(0, i + 1).equals(B.substring(len - (i + 1), len)) &&
                    A.substring(i + 1, len).equals(B.substring(0, len - (i + 1)))){
                return true;
            }
        }
        return false;
    }
}
