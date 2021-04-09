package Solution;

import java.util.*;

public class Solution784 {
    public List<String> letterCasePermutation( String S) {
        if(S.length() == 0) return new LinkedList<>();

        Queue<String> queue = new LinkedList<String>(  );
        queue.add(S);

        for(int i = 0; i< S.length();i++){
            if(Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for(int j = 0; j < size;j ++){
                String cur = queue.poll();
                char[] curArry = cur.toCharArray();
                curArry[i] = Character.toUpperCase(curArry[i]);
                queue.add(String.valueOf(curArry));
                curArry[i] = Character.toLowerCase(curArry[i]);
                queue.add(String.valueOf(curArry));
            }
        }
        return new LinkedList<>( queue );
    }
}
