package Solution;

public class Solution53{
    public int maxSubArray(int[] nums) {
        return Subarray(nums, 0 ,nums.length -1 );
    }

    public int Subarray(int[] A,int left, int right){
        if(left == right){return A[left];}
        int mid = left + (right - left) / 2;
        int leftSum = Subarray(A,left,mid);// left part
        int rightSum = Subarray(A,mid+1,right);//right part
        int crossSum = crossSubarray(A,left,right);// cross part
        return Math.max(Math.max(leftSum,rightSum), crossSum);
    }
    public int crossSubarray(int[] A,int left,int right){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int mid = left + (right - left) / 2;
        for(int i = mid; i >= left ; i--){
            sum = sum + A[i];
            if(leftSum < sum) leftSum = sum;
        }
        sum = 0;
        for(int j = mid + 1; j <= right; j++){
            sum = sum + A[j];
            if(rightSum < sum) rightSum = sum;
        }
        return leftSum + rightSum;
    }
}



//public class Solution53 {
//    public int maxSubArray(int[] nums){
//        if(nums.length == 1) return nums[0];
//
//        int left = 0, res = Integer.MIN_VALUE;
//
//        for (int num : nums) {
//            left += num;
//            res = Math.max(res, left);
//            if (left < 0) left = 0;
//        }
//
//        return res;
//    }
//}
