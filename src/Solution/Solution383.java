package Solution;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charArr = new int[26];
        for(int i = 0; i< ransomNote.length(); i++){
            charArr[ransomNote.charAt(i) - 'a'] += 1;
        }
        for(int j = 0; j< magazine.length(); j++){
            charArr[magazine.charAt(j) - 'a'] -= 1;
        }
        for(int ele: charArr){
            if(ele > 0) return false;
        }
        return true;
    }
}
