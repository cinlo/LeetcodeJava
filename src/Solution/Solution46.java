package Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution46{
    public List<List<Integer>> permute(int[] nums) {
        Queue<List<Integer>> queue = new LinkedList<>(  );
        List<Integer> firstEle = new ArrayList<>();
        firstEle.add(nums[0]);
        queue.add(firstEle);

        for(int n = 1; n < nums.length; n++){
            int size =queue.size( );
            for(int i = 0; i < size; i++){
                List<Integer> cur = queue.poll();
                for(int j = 0; j < cur.size() + 1;j++){
                    List<Integer> temp =new ArrayList<>(cur);
                    temp.add(j, nums[n]);
                    queue.add(temp);
                }
            }
        }

        return new ArrayList<List<Integer>>( queue );
    }
}


//public class Solution46 {
//    public List<List<Integer>> permute( int[] nums) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>(  );
//        backTrack(res,new ArrayList<>(), nums);
//        return res;
//    }
//
//    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums){
//        if(tempList.size() == nums.length){
//            res.add(new ArrayList<>(tempList));
//        }
//        else{
//            for(int ele : nums){
//                if(tempList.contains(ele)) continue;
//                tempList.add(ele);
//                backTrack(res, tempList, nums);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }
//}
