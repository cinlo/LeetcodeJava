package Solution;

public class Solution66 {
    public int[] plusOne(int[] digits){
        int len = digits.length;

        for(int i = len - 1; i >= 0; i--){
            digits[i] += 1;
            if(digits[i] < 10) return digits;
            digits[i] -= 10;
        }

        int[] res = new int[len + 1];
        res[0] = 1;
        System.arraycopy(digits,0,res,1,len);
        return res;
    }
}
