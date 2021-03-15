package Solution;

public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder res =new StringBuilder( );

        while(columnNumber != 0){
            int cur = columnNumber % 27;
            res.insert(0,(char) ('A' + cur - 1));
            columnNumber = columnNumber / 27;
        }
        return res.toString( );
    }
}
