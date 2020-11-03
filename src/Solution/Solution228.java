package Solution;
import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int n = nums.length;
        if(n == 0) return result;
        if(n == 1) {
            result.add(nums[0] + "");
            return result;
        }

        int start = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1] + 1){
                if(nums[i - 1] == start) result.add(start + "");
                else result.add(start + "->" + nums[i-1]);
                start = nums[i];
            }
        }
        if(!result.get(result.size()-1).equals(Integer.toString(nums[n - 1]))) result.add(nums[n-1] +"");
        return result;
    }

//=====================================================================
//    Version 1.0
//=====================================================================

//    public List<String> summaryRanges(int[] nums) {
//        //null case
//        int n = nums.length;
//        List<String> result = new ArrayList<String>();
//        if(n == 0) return result;
//        if(n == 1) {
//            result.add(Integer.toString(nums[0]));
//            return result;
//        }
//
//        //add range
//        List<Integer> resultList = new ArrayList<Integer>();
//        resultList.add(nums[0]);
//        int cur = nums[0];
//        for(int i = 0; i < n; i++){
//            if(nums[i] > cur){
//                resultList.add(nums[i-1]);
//                cur = nums[i];
//                resultList.add(cur);
//            }
//            cur ++;
//        }
//        resultList.add(nums[n - 1]);
//        String curString;
//        System.out.println(resultList);
//
//        //range to string
//        for(int i = 0; i < resultList.size()-1; i++){
//            if(!resultList.get(i).equals(resultList.get(i + 1))){
//                curString = resultList.get(i) + "->" + resultList.get(i + 1);
//            }
//            else{
//                curString = Integer.toString(resultList.get(i));
//            }
//            result.add(curString);
//            i++;
//        }
//        return result;
//    }
//=====================================================================
//    Version 1.0
//=====================================================================
}
