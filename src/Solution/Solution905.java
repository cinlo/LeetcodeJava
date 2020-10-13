package Solution;

public class Solution905 {
    public int[] sortArrayByParity(int[] A){
        int n = A.length;
        if(n < 2) return A;

        int fast, slow = 0, cur;
        for(fast = 0; fast < n; fast++){
            if(A[fast] % 2 == 0){
                cur = A[slow];
                A[slow++] = A[fast];
                A[fast] = cur;
            }
        }
        return A;
    }
}
