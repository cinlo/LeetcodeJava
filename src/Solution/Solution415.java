package Solution;

public class Solution415 {
    public String addStrings(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
        int i =0, carry = 0;
        StringBuilder res = new StringBuilder(  );
        while(i < len || carry != 0){
            int tmp = 0;
            if(i < num1.length())  tmp += num1.charAt(num1.length() - i - 1) - '0';
            if(i < num2.length())  tmp += num2.charAt(num2.length() - i - 1) - '0';
            if(carry != 0) tmp ++;
            res.insert(0,tmp % 10);
            carry = tmp/10;
            i++;
        }
        return res.toString();
    }
}
