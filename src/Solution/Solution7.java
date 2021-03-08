package Solution;

public class Solution7 {
    public int reverse(int x){
        int cur, res = 0;
        if(x == -Integer.MAX_VALUE - 1) return 0;
        boolean negative = x < 0;
        x = Math.abs(x);

        while(x != 0){
            cur = x % 10;
            x = x / 10;
            if(res > (Math.pow(2,31) - 1)/10) return 0;
            if(res == (Math.pow(2,31) - 1)/10 & cur > (Math.pow(2,31) - 1)%10) return 0;
            res = res * 10 + cur;
        }

        if(negative) res = res * (-1);
        return res;
    }
}
