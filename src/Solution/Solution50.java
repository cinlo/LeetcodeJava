package Solution;

public class Solution50 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double res = myPow(x, Math.abs(n/2));
        res = n % 2 == 0? res * res : res * res * x;
        return n > 0? res: 1/res;
    }
}
