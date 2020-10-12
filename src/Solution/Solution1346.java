package Solution;

import java.util.Arrays;

public class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = 1;
        System.out.println(Arrays.toString(arr));
        while(j < arr.length){
            if(arr[j] < 0){
                while(arr[i] < arr[j] * 2 && i < j - 1){i ++;}
                if(arr[i] == arr[j] * 2){
                    return true;}
            }
            else{
                while(arr[i] * 2 < arr[j] && i < j - 1){i ++;}
                if(arr[i] * 2 == arr[j]){return true;}
            }
            j++;
        }
        return false;
    }
}

