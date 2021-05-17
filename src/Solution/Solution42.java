package Solution;

public class Solution42 {
    public int trap(int[] height) {
        if(height.length < 2) return 0;
        int res = 0, left = 0, right = height.length;
        int maxLeft = 0, maxRight = 0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] > maxLeft) maxLeft = height[left];
                else res += maxLeft - height[left];
                left++;
            }
            else{
                if(height[right] > maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                right--;
            }
        }
        return res;
    }
}
