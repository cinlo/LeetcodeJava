package Solution;

public class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        int[] res = new int[3];
        for(int i = 1; i < s.length() - res[0];i++){
            int[] res1 = helper(s,i - 1, i + 1);
            int[] res2 = new int[3];
            if(s.charAt(i - 1) == s.charAt(i)){
                res2 = helper(s, i - 2,i + 1);
            }
            if(res1[0] > res[0] || res2[0] > res[0]){
                System.out.println(res[0]);
                res = res1[0] > res2[0]? res1: res2;
            }
        }
        return s.substring(res[1], res[2] + 1);
    }

    private int[] helper(String s, int left, int right){
        int[] res = new int[3];
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right++;
        }
        res[1] = left + 1;
        res[2] = right - 1;
        res[0] = right - left - 1;
        return res;
    }
}
