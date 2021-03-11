package Solution;

public class Solution69 {
    public int mySqrt(int x){
        // Corner cases
        if(x == 0) return 0;
        //Binary Search
        int left = 1, right = x, middle;
        while(left <= right){
            middle = left + (right - left) /2;
            if(middle <= x/middle & (middle + 1) > x/(middle + 1)) return middle;
            if(middle > x/middle) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}
