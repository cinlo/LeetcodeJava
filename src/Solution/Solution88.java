package Solution;

public class Solution88{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while(tail1 >= 0 & tail2 >= 0){
            nums1[finished--] = (nums1[tail1] > nums2[tail2])? nums1[tail1--] : nums2[tail2 --];
        }
        while(tail2 >= 0){
            nums1[finished--] = nums2[tail2--];
        }
    }
}


//public class Solution88 {
//    public void merge(int[] nums1, int m, int[] nums2, int n){
//        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
//        while(tail1 >= 0 & tail2 >= 0){
//            nums1[finished--] = (nums1[tail1] > nums2[tail2])? nums1[tail1--] : nums2[tail2 --];
//        }
//        while(tail2 >= 0){
//            nums1[finished--] = nums2[tail2--];
//        }
//    }
//
//
//
//
//    public void merge_1(int[] nums1, int m, int[] nums2, int n) {
//        int[] res = new int[m + n];
//        int j = 0;
//        int r = 0;
//
//        if(n == 0){
//            return;
//        }
//
//        for(int i = 0; i < m; i++){
//            while(j < n && nums1[i] > nums2[j]){
//                res[r] = nums2[j];
//                j ++;
//                r ++;
//            }
//            res[r] = nums1[i];
//            r++;
//        }
//        while(j < n){
//            res[r] = nums2[j];
//            j ++;
//            r ++;
//        }
//        for(int i = 0; i < (m + n); i++){
//            nums1[i] = res[i];
//        }
//    }
//}
