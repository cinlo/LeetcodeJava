package Solution;

import java.util.*;

public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(res, new ArrayList<>(  ), candidates, target,0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> tmpList, int[] candidates, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) res.add(new ArrayList<>( tmpList ));
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                tmpList.add(candidates[i]);
                backTrack(res, tmpList,candidates, remain - candidates[i],i + 1);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
