package Solution;

//simplify
public class Solution38{
    public String countAndSay(int n ){
        if(n == 1) return "1";

        String str = countAndSay(n -1);
        Character cur = str.charAt(0);
        int curCount = 1;
        String res = "";
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) != cur){
                res += String.valueOf(curCount);
                res += String.valueOf(cur);
                cur = str.charAt(i);
                curCount = 0;
            }
            curCount ++;
        }
        res += String.valueOf(curCount);
        res += String.valueOf(cur);
        return res;
    }
}



// use two function
//public class Solution38 {
//    public String countAndSay(int n) {
//        if (n == 1) return "1";
//        String tem = "1";
//
//        for(int i = 2; i < n + 1; i++){
//            tem = countString(tem);
//        }
//
//        return tem;
//    }
//
//    public String countString(String str){
//        Character cur = str.charAt(0);
//        int curCount = 1;
//        String res = "";
//        for(int i = 1; i < str.length(); i++){
//            if(str.charAt(i) != cur){
//                res += String.valueOf(curCount);
//                res += String.valueOf(cur);
//                cur = str.charAt(i);
//                curCount = 0;
//            }
//            curCount ++;
//        }
//        res += String.valueOf(curCount);
//        res += String.valueOf(cur);
//        return res;
//    }
//}
