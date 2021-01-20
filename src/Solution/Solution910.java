package Solution;

public class Solution910 {
    public int smallestRangeII(int[] A, int k){
        if(A.length == 0) return 0;

        int sum = 0, min = 10000, max = 0;
        for(int a: A) {
            sum += a;
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        if(max - min <= k) return max - min;

        float average = (float) sum/(float) A.length;
        System.out.println(average);
        min = 10000;
        max = 0;
        int cur;
        for(int a: A){
            if(a > average) cur = a - k;
            else cur = a + k;
            min = Math.min(min, cur);
            max = Math.max(max, cur);
            System.out.println(cur);
        }
        return max - min;
    }
}
