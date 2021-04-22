package Solution;

import java.util.*;
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        //check each row & column;
        for(int i = 0; i < 9; i++){
            Set<Character> rowCheckSet = new HashSet<Character>(  );
            Set<Character> colCheckSet = new HashSet<Character>(  );
            int rowCount = 0, colCount = 0;
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    rowCheckSet.add(board[i][j]);
                    rowCount++;
                    if(rowCheckSet.size() != rowCount) return false;
                }
                if(board[j][i] != '.'){
                    colCheckSet.add(board[j][i]);
                    colCount++;
                    if(colCheckSet.size() != colCount) return false;
                }

            }
        }

        //check 3 * 3;
        for(int i = 0; i < 9; i = i + 3){
            for(int j = 0; j < 9; j = j + 3){
                Set<Character> cubeCheckSet = new HashSet<Character>(  );
                int cubeCount = 0;
                for(int m = 0; m < 3; m++){
                    for(int n = 0; n < 3; n++){
                        if(board[i + m][j + n] != '.'){
                            cubeCheckSet.add(board[i + m][j + n]);
                            cubeCount++;
                            if(cubeCheckSet.size() != cubeCount) return false;
                        }
                    }
                }

            }
        }
        return true;
    }
}
