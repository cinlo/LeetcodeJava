package Solution;

public class Solution443 {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        char cur = chars[0];
        int i = 0, count = 1;
        for(int j = 1; j < chars.length; j ++){
            if(chars[j] != cur || j == chars.length - 1){
                //update the char;
                chars[i++] = cur;
                char tmp = chars[j];

                //update the freq if count > 1;
                if(chars[j] == cur) count++;
                if(count != 1){
                    int countLen = String.valueOf(count).length();
                    while(countLen != 0){
                        chars[i++] =(char) (count/Math.pow(10, countLen - 1) + '0');
                        count =(int) (count % Math.pow(10, countLen - 1));
                        countLen--;
                    }
                }

                //if last one is unique
                if(tmp != cur && j == chars.length - 1) chars[i++] = chars[j];

                //update next
                cur = chars[j];
                count = 1;
            }
            else count++;
        }
        return i;
    }
}