package Solution;

public class Solution70 {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        // for each turn, there will be i times of 2 steps
        double res = 1, isum = 1;
        for(int i = 1; i <= n/2; i++){
            isum *= i;
            double temp = 1;
            for(double start = n - i; start > (n - 2 * i); start --) temp = temp * (start);
            res = res + temp/isum;
        }
        return (int) res;
    }
}
