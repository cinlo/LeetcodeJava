package Solution;

public class Solution367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int left = 1, right = num;
        while(left <= right){
            int middle = left + (right - left)/2;
            if((double)middle == (double)num/middle) return true;
            else if((double)middle <= (double)num/middle) left = middle + 1;
            else right = middle - 1;
            System.out.println( left + "  " + right );
        }
        return false;
    }
}
