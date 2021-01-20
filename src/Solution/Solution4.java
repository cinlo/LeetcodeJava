package Solution;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m == 0 & n % 2 ==0) return (nums2[n/2 - 1] + nums2[n/2])/(float)2;
        if(m == 0 & n % 2 ==1) return nums2[n/2];
        if(n == 0 & m % 2 ==0) return (nums1[m/2 - 1] + nums1[m/2])/(float)2;
        if(n == 0 & m % 2 ==1) return nums1[m/2];

        int odd = (m + n) % 2;
        int res = (m + n) / 2 + odd;
        float val1 = 0, val2;
        int i = 0, j = 0, cur = 1;

        while (cur <= res) {
            if (nums1[i] < nums2[j]) {
                val1 = nums1[i];
                i++;
                if(i == m){
                    i = m - 1;
                    nums1[i] = (int) Math.pow(10, 6);
                }
            } else {
                val1 = nums2[j];
                j++;
                if(j == n){
                    j = n - 1;
                    nums2[j] = (int) Math.pow(10,6);
                }
            }
            cur++;
        }

        val2 = Math.min(nums1[i], nums2[j]);
        if(odd == 1) return val1;
        else return (val1 + val2)/2;
    }
}
