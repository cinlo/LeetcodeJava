package Solution;

import java.util.*;

public class Solution54 {
    public List<Integer> spiralOrder( int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        List<Integer> res = new ArrayList<>(  );
        res.add(matrix[0][0]);
        visited[0][0] = true;
        int i = 0, j = 0, left = matrix.length * matrix[0].length - 1;
        while( left != 0){
            //right
            while( j + 1< matrix[0].length && !visited[i][j + 1] ) {
                j++;
                visited[i][j] = true;
                res.add(matrix[i][j]);
                left--;
            }
            //down
            while( i + 1 < matrix.length && !visited[i+1][j] ) {
                i++;
                visited[i][j] = true;
                res.add(matrix[i][j]);
                left--;
            }
            //lefts
            while( j - 1 >= 0 && !visited[i][j - 1]) {
                j--;
                visited[i][j] = true;
                res.add(matrix[i][j]);
                left--;
            }
            //up
            while( i - 1 >= 0 && !visited[i - 1][j]) {
                i--;
                visited[i][j] = true;
                res.add(matrix[i][j]);
                left--;
            }
        }
        return res;
    }
}
