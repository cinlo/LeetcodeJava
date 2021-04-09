package Solution;

import java.util.*;

public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strArr = paragraph.split("[ !?',;.]");
        HashMap<String, Integer> map = new HashMap<String, Integer>(  );
        for(String ele: strArr){
            String tmp = ele.toLowerCase();
            if(tmp.equals("") || Arrays.asList(banned).contains(tmp)){
                continue;
            }
            if(map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            else {
                map.put(tmp,1);
            }
        }
        int maxTime = 0;
        String res = "";
        for(String keys: map.keySet()){
            if(map.get(keys) > maxTime){
                res = keys;
                maxTime = map.get(keys);
            }
        }
        return res;
    }
}
