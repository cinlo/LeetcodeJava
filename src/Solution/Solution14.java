package Solution;

public class Solution14 {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";

        String cur = strs[0];
        for(int i = 1; i < strs.length;i++){
            int j = 0;
            while( j < cur.length()){
                if(j >= strs[i].length()) {
                    cur = cur.substring(0,j);
                    break;
                }
                if(cur.charAt(j) != strs[i].charAt(j)){
                    if(j > 0) cur = cur.substring(0,j);
                    else return "";
                    break;
                }
                j++;
            }
        }
        return cur;
    }
}
