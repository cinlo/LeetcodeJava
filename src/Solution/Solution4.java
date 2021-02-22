package Solution;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

//      m >= n
        int m = nums1.length, n = nums2.length;
        if (n == 0) return (nums1[(m - 1) / 2] + nums1[m / 2]) / 2.0;

        int left = 0, right = 2 * n;
        while(left <= right){
            int mid2 = (left + right) / 2;
            int mid1 = m + n - mid2;

            double L1 = mid1 == 0 ? Double.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double L2 = mid2 == 0 ? Double.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = mid1 == m * 2 ? Double.MAX_VALUE : nums1[mid1 / 2];
            double R2 = mid2 == n * 2 ? Double.MAX_VALUE : nums2[mid2 / 2];
            if (L1 > R2) left = mid2 + 1;
            else if (L2 > R1) right = mid2 - 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;
    }
}

//public class Solution4 {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2){
//        // make sure nums2 longer than nums1
//       if(nums1.length > nums2.length){
//           int[] temp = nums1;
//           nums1 = nums2;
//           nums2 = temp;
//       }
//       int total = nums1.length + nums2.length;
//       int res = (total + 1) / 2;
//       int l = 0, r = nums1.length - 1;
//       int i = (l + r - 1) / 2, j = res - i - 2;
//       double nums1Left,nums1Right,nums2Left,nums2Right;
//
//       while(true){
//           System.out.println(j);
//           if(i >= 0 & i < nums1.length)  nums1Left = nums1[i];
//           else nums1Left = Double.MIN_VALUE;
//           if((i + 1) < nums1.length) nums1Right = nums1[i + 1];
//           else nums1Right = Double.MAX_VALUE;
//
//           if(j >= 0 & j < nums2.length) nums2Left = nums2[j];
//           else nums2Left = Double.MIN_VALUE;
//           if((j + 1) < nums2.length) nums2Right = nums2[j + 1];
//           else nums2Right = Double.MAX_VALUE;
//
//           if(nums1Left <= nums2Right & nums2Left <= nums1Right){
//               if(total % 2 == 1) return Math.max(nums1Left,nums2Left);
//               else return (Math.max(nums1Left,nums2Left) + Math.min(nums1Right, nums2Right))/(float)2;
//           }
//
//           if(nums1Left > nums2Right) r = i - 1;
//           if(nums2Left > nums1Right) l = i + 1;
//           i = (l + r - 1) / 2;
//           j = res - i - 2;
//
//           System.out.println(i);
//       }
//    }


//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//        if(m == 0 & n % 2 ==0) return (nums2[n/2 - 1] + nums2[n/2])/(float)2;
//        if(m == 0 & n % 2 ==1) return nums2[n/2];
//        if(n == 0 & m % 2 ==0) return (nums1[m/2 - 1] + nums1[m/2])/(float)2;
//        if(n == 0 & m % 2 ==1) return nums1[m/2];
//
//        int odd = (m + n) % 2;
//        int res = (m + n) / 2 + odd;
//        float val1 = 0, val2;
//        int i = 0, j = 0, cur = 1;
//
//        while (cur <= res) {
//            if (nums1[i] < nums2[j]) {
//                val1 = nums1[i];
//                i++;
//                if(i == m){
//                    i = m - 1;
//                    nums1[i] = (int) Math.pow(10, 6);
//                }
//            } else {
//                val1 = nums2[j];
//                j++;
//                if(j == n){
//                    j = n - 1;
//                    nums2[j] = (int) Math.pow(10,6);
//                }
//            }
//            cur++;
//        }
//
//        val2 = Math.min(nums1[i], nums2[j]);
//        if(odd == 1) return val1;
//        else return (val1 + val2)/2;
//    }
//}
