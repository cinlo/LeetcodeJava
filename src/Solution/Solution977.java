package Solution;
import java.util.Arrays;
import java.util.Stack;

public class Solution977 {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}

//
//class Solution977_S1 {
//    public int[] sortedSquares(int[] A) {
//        Stack<Integer> negtiveNums = new Stack<Integer>();
//        int[] result = new int[A.length];
//        int i = 0;
//
//        for(int a : A){
//            int sqrCur = a * a;
//            if(a < 0){
//                negtiveNums.push(sqrCur);
//                continue;
//            }
//            while(!negtiveNums.empty() && sqrCur > (int)negtiveNums.peek()){
//                result[i] = (int)negtiveNums.pop();
//                i++;
//            }
//            result[i] = sqrCur;
//            i ++;
//        }
//
//        while(!negtiveNums.empty()){
//            result[i] = (int)negtiveNums.pop();
//            i++;
//        }
//
//        System.out.println(Arrays.toString(result));
//        return result;
//    }
//}
