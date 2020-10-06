package Solution;

public class Solution1099 {
    public int bitwiseComplement(int N) {
        if(N == 0){return 1;}
        int remain = N;
        int i = 0;
        while(remain != 1){
            remain /= 2;
            i ++;
        }
        int sumBinary = (int) (Math.pow(2, i + 1) - 1);
        int result = sumBinary - N;
        return result;
    }
}
