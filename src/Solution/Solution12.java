package Solution;

import java.util.HashMap;

public class Solution12{
    public String intToRoman(int num){
        StringBuilder res = new StringBuilder(  );
        String[][] table = {{"1000","M"},{"900","CM"},{"500", "D"},{"400","CD"},{"100","C"},{"90","XC"},{"50","L"},
                {"40","XL"},{"10","X"},{"9","IX"},{"5","V"},{"4","IV"},{"1","I"}};

        int start = -1;
        while(num!= 0){
            start ++;
            int cur = Integer.parseInt(table[start][0]);
            if(num < cur) continue;
            res.append(table[start][1].repeat(num/cur));
            num = num % cur;
        }
        return res.toString();
    }
}

//public class Solution12 {
//    public String intToRoman(int num) {
//        StringBuilder res = new StringBuilder(  );
//        int[] tmp = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        int start = -1;
//        while(num != 0){
//            start++;
//            if(num < tmp[start]) continue;
//            res.append(getRoman(tmp[start]).repeat(num/tmp[start]));
//            num = num % tmp[start];
//        }
//        return res.toString();
//    }
//
//    public String getRoman(int x){
//        String res = "";
//        switch (x) {
//            case 1 -> res = "I";
//            case 4 -> res = "IV";
//            case 5 -> res = "V";
//            case 9 -> res = "IX";
//            case 10 -> res = "X";
//            case 40 -> res = "XL";
//            case 50 -> res = "L";
//            case 90 -> res = "XC";
//            case 100 -> res = "C";
//            case 400 -> res = "CD";
//            case 500 -> res = "D";
//            case 900 -> res = "CM";
//            case 1000 -> res = "M";
//        }
//        return res;
//    }
//}
