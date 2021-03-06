package Solution;

public class Solution125 {
    public boolean isPalindrome(String s){
        if(s.length() == 1) return true;

        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();

        while(i <= j){
            if(!((s.charAt(i) >= 'a' & s.charAt(i) <= 'z' )|| (s.charAt(i) >= '0' & s.charAt(i) <= '9'))){
                i ++;
                continue;
            }
            if(!((s.charAt(j) >= 'a' & s.charAt(j) <= 'z' )|| (s.charAt(j) >= '0' & s.charAt(j) <= '9'))){
                j --;
                continue;
            }
            System.out.println( "this is i " + s.charAt(i) );
            System.out.println( "this is j " + s.charAt(i) );

            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}
