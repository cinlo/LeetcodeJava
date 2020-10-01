package Solution;

public class Solution1295 {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            int len = Integer.toString(num).length();
            if (len % 2 == 0) {
                cnt ++;
            }
        }
        return cnt;
    }
}


