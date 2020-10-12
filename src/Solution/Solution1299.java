package Solution;

public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n == 1){return new int[] {-1};}
        int cur = arr[n - 1], maxValue = arr[n - 1];

        for(int i = n - 1; i >=0; i--){
            cur = Math.max(cur, arr[i]);
            arr[i] = maxValue;
            maxValue = cur;
        }
        arr[n - 1] = -1;

        return arr;
    }
}
