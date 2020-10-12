package Solution;

public class Solution941 {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3){return false;}
        if(A[0] > A[1]){return false;}

        int i;
        for(i = 1; i < A.length - 1; i++){
            if(A[i] == A[i - 1]){return false;}
            if(A[i] < A[i - 1]){break;}
        }
        for(i = i; i < A.length; i++){
            if(A[i] >= A[i - 1]){return false;}
        }
        return true;
    }
}
