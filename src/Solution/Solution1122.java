package Solution;
import java.util.*;

public class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> leftInt = new HashMap<Integer, Integer>(  );
        ArrayList<Integer> rightInt = new ArrayList<>(  );
        for(int ele: arr2) leftInt.put(ele, 0);
        for(int ele: arr1){
            if(leftInt.containsKey(ele)){
                leftInt.put(ele, leftInt.get(ele) + 1);
            }
            else{
                rightInt.add(ele);
            }
        }
        int i = 0;
        for(int ele:arr2){
            int times = leftInt.get(ele);
            while(times!= 0){
                arr1[i++] = ele;
                times--;
            }
        }
        int[] rightArr = rightInt.stream().mapToInt(a -> a).toArray();
        Arrays.sort(rightArr);
        System.arraycopy(rightArr,0,arr1,i,rightArr.length);
        return arr1;
    }
}
