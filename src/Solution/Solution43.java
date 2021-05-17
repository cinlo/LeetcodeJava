package Solution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution43 {
    public String multiply(String num1, String num2) {
        if(num1.length() == 0 || num2.length() == 0 || num1.equals("0") || num2.equals("0") ) return "0";
        int[] res = new int[num1.length() + num2.length()];

        for(int i = num1.length() - 1; i >= 0; i --){
            for(int j = num2.length() - 1; j >= 0; j--){
                int digitFromNum1 = num1.charAt(i) - '0';
                int digitFromNum2 = num2.charAt(j) - '0';
                int curProduct = digitFromNum1 * digitFromNum2;
                int index = i + j + 1;
                int carry = 0;
                while(curProduct != 0 || carry != 0){
                    res[index] += (curProduct % 10 + carry);
                    carry = 0;
                    if(res[index] > 9){
                        res[index] -= 10;
                        carry = 1;
                    }
                    index--;
                    curProduct = curProduct/10;
                }
            }
        }

        int start = res[0] == 0? 1:0;
        String resStr = "";
        for(int i = start; i < res.length;i++){
            resStr += res[i];
        }
        return resStr;
    }
}
