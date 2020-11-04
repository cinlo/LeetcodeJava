package Solution;

public class Solution1446 {
    public int maxPower(String s){
        int n = s.length(), result = 1, cur = 1;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i-1)) cur++;
            else {
                if (cur > result) result = cur;
                cur = 1;
            }
        }
        if (cur > result) result = cur;
        return result;
    }
}
