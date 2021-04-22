package Solution;

import java.util.*;

public class Solution17 {
    public List<String> letterCombinations( String digits) {
        List<String> res = new ArrayList<String>(  );
        if(digits.length()==0) return res;

        char[][] dict = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                {'t','u','v'},{'w','x','y','z'}};
        Queue<String> queue = new LinkedList<String>(  );
        for(char ele: dict[digits.charAt(0) - '2']){
            queue.add(String.valueOf(ele));
        }

        for(int i = 1; i < digits.length();i++){
            int size = queue.size();
            for(int j = 0; j < size; j++){
                String cur = queue.poll();
                for(char ele : dict[digits.charAt(i) - '2']){
                    String tmp = cur;
                    tmp = tmp + ele;
                    queue.add(tmp);
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
