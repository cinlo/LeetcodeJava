package Solution;

public class Solution28 {
    public int strStr(String haystack, String needle){
        int len1 = needle.length(), len2 = haystack.length();
        if(len1 == 0) return 0;
        if(len1 > len2 ) return -1;
        if(len1 == len2){
            if(haystack.equals(needle)) return 0;
            else return -1;
        }

        for(int i = 0; i < len2 - len1 + 1; i++){
            if(haystack.substring(i, i + len1).equals(needle)) return i;
        }

        return -1;
    }
}
