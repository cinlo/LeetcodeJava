package Solution;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while(i < j){
            int cur = numbers[i] + numbers[j];
            if(cur == target) {
                int[] res = new int[];
                res[0] = i;
                res[1] = j;
                return res;
            }
            if(cur > target) j--;
            if(cur < target) i++;
        }
        return null;
    }
}
