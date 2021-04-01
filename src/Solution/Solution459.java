package Solution;

public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        int strLen = s.length();
        if(strLen == 1) return true;

        for(int i = 0; i < strLen; i++){
            String sub = s.substring(0,i);
            int subLen = i + 1;
            if(strLen % subLen == 0){
                if(s.equals(sub.repeat(strLen / subLen))) return true;
            }
        }
        return false;
    }
}
