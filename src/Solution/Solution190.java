package Solution;

public class Solution190 {
    public int reverseBits(int n) {
        int res = 0;

        for(int i = 0; i < 32; i++){
            res *= 2;
            res += n % 2;
            n = n/2;
        }
        return res;
    }
}
