package Solution;

import java.util.Arrays;

public class Solution1051 {
    public int heightChecker(int[] height){
        int result = 0;
        int[] heightFreq = new int[101];
        for (int i : height) heightFreq[i] += 1;
        int cur = 0;
        while(heightFreq[cur] == 0) cur++;
        for (int j : height){
            if(j != cur) result ++;
            heightFreq[cur] --;
            while(heightFreq[cur] == 0 && cur < 100) cur++;
        }
        return result;
    }

//    /*==============Version 1 O(nlog(n))=============*/
//    public int heightChecker(int[] height){
//        int n = height.length, result = 0;
//        if(n < 2) return result;
//        int[] heightSorted = height.clone();
//        Arrays.sort(heightSorted);
//        for(int i = 0; i < n; i++){
//            if(height[i] != heightSorted[i]) result++;
//        }
//        return result;
//    }
//    /*====================================*/
}
