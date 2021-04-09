package Solution;

//===O(log(n))===
public class Solution852{
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int middle = left + (right - left)/2;
            System.out.println("left " + left + " right " + right + " " + middle);
            if(arr[middle - 1] < arr[middle] && arr[middle] > arr[middle + 1]) return middle;
            if(arr[middle] < arr[middle + 1]){
                left = middle;
            }
            else{
                right = middle;
            }
        }
        return -1;
    }
}



////======O(n)===
//public class Solution852 {
//    public int peakIndexInMountainArray(int[] arr) {
//        for(int i = 1; i < arr.length - 1;i++){
//            if(arr[i] > arr[i + 1]) return i;
//        }
//        return -1;
//    }
//}
