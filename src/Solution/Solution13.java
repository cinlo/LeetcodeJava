package Solution;

public class Solution13{
    public int romanToInt(String s){
        int ans = 0, tempOne = 0, tempTwo = 0;

        for(int i = 0; i < s.length() - 1; i++){
            tempOne = getInt(s.charAt(i));
            tempTwo = getInt(s.charAt(i+1));
            if(tempOne < tempTwo) ans = ans - tempOne;
            else ans = ans + tempOne;
        }
        ans = ans + getInt(s.charAt(s.length()-1));
        return ans;
    }

    public int getInt(char x){
        switch (x) {
            case 'I' -> x = 1;
            case 'X' -> x = 10;
            case 'V' -> x = 5;
            case 'L' -> x = 50;
            case 'C' -> x = 100;
            case 'D' -> x = 500;
            case 'M' -> x = 1000;
        }
        return x;
    }
}

//public class Solution13 {
//    public int romanToInt(String s){
//        int len = s.length(), res = 0;
//
//        for(int i = 0; i < len; i++){
//            System.out.println(res);
//
//            // I, IV, IX
//            if(s.charAt(i) == 'I'){
//                if((i + 1) < len && s.charAt(i + 1) == 'V'){
//                    res += 4;
//                    i++;
//                }
//                else if((i + 1) < len && s.charAt(i + 1) == 'X'){
//                    res += 9;
//                    i++;
//                }
//                else res += 1;
//                continue;
//            }
//
//            //X,XL,XC
//            if(s.charAt(i) == 'X'){
//                if((i + 1) < len && s.charAt(i + 1) == 'L'){
//                    res += 40;
//                    i++;
//                }
//                else if((i + 1) < len && s.charAt(i + 1) == 'C'){
//                    res += 90;
//                    i++;
//                }
//                else res += 10;
//                continue;
//            }
//
//            //C,CD,CM
//            if(s.charAt(i) == 'C'){
//                if((i + 1) < len && s.charAt(i + 1) == 'D'){
//                    res += 400;
//                    i++;
//                }
//                else if((i + 1) < len && s.charAt(i + 1) == 'M'){
//                    res += 900;
//                    i++;
//                }
//                else res += 100;
//                continue;
//            }
//
//            if(s.charAt(i) == 'V') res += 5;
//            if(s.charAt(i) == 'L') res += 50;
//            if(s.charAt(i) == 'D') res += 500;
//            if(s.charAt(i) == 'M') res += 1000;
//        }
//        return res;
//    }
//}
