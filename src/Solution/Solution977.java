package Solution;

import java.util.ArrayList;
import java.util.Stack;

public class Solution977 {
    public Object[] sortedSquares(int[] A) {
        Stack<Integer> negtiveNums = new Stack<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int a : A){
            int sqrCur = a * a;
            if(a < 0){
                negtiveNums.push(sqrCur);
                continue;
            }
            while(sqrCur > (int)negtiveNums.peek()){
                result.add((int)negtiveNums.pop());
            }
            result.add(sqrCur);
        }
        return result.toArray();
    }
}
