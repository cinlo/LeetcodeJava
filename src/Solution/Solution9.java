package Solution;

public class Solution9{
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        String xString = Integer.toString(x);
        int i = 0, j = xString.length() - 1;

        while(i <= j){
            if(xString.charAt(i) != xString.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}


//
////find the reverse number
//public class Solution9 {
//    public boolean isPalindrome(int x){
//        int  init = x, cur, reverse = 0;
//        if(x < 0) return false;
//
//        while(x != 0){
//            cur = x % 10;
//            x = x / 10;
//            reverse = reverse * 10 + cur;
//        }
//
//        return reverse == init;
//    }
//}
