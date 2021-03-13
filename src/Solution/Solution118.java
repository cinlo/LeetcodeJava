package Solution;

import java.util.ArrayList;
import java.util.List;

//======
public class Solution118 {
    public List<List<Integer>> generate( int numRows) {
        // Initialize
        List<Integer> temp = new ArrayList<>( );
        List<List<Integer>> res = new ArrayList<List<Integer>>( ) ;
        temp.add(1);
        res.add(temp);
        if(numRows == 1) return res;
        temp = new ArrayList<>(  );
        temp.add(1);
        temp.add(1);
        res.add(temp);

        for(int i = 3; i <= numRows; i++){
            temp = new ArrayList<>( );
            temp.add(1);
            for(int j = 1; j < i - 1; j++ ){
                int cur = res.get(i - 2).get(j - 1) + res.get(i - 2).get(j);
                temp.add(cur);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
