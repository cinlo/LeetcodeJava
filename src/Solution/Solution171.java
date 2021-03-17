package Solution;

public class Solution171 {
    public int  titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for(int i = 0; i < len; i++){
            res *= 26;
            res += columnTitle.charAt(i) - 'A' + 1;
        }
        return res;
    }
}
