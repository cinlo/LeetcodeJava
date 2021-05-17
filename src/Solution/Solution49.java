package Solution;
import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams( String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>(  );
        HashMap<String, Integer> hm = new HashMap<>(  );

        for(String ele : strs){
            char[] charArrays = ele.toCharArray();
            Arrays.sort(charArrays);
            String cur = new String(charArrays);
            if(!hm.containsKey(cur)){
                hm.put(cur, res.size());
                List<String> curString = new ArrayList<>(  );
                curString.add(ele);
                res.add(curString);
            }else{
                int index = hm.get(cur);
                List<String> curString = res.get(index);
                curString.add(ele);
                res.set(index, curString);
            }
        }
        return res;
    }
}
