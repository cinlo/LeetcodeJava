package Solution;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        Queue<Integer> res = new LinkedList<Integer>();

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){res.add(0);}
            res.add(arr[i]);
        }

        for(int i = 0; i < n; i++){
            arr[i] = res.poll();
        }
    }
}
