package Solution;

import java.util.*;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] arrOfStr = s.split(" ", -2);
        HashMap<Character,String> hm = new HashMap<Character, String>();
        if(pattern.length() != arrOfStr.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){
                if( !hm.get(pattern.charAt(i)).equals(arrOfStr[ i ]) ) return false;
            }
            else{
                hm.put(pattern.charAt(i), arrOfStr[i]);
            }
        }

        Set<String> a=new HashSet<String>(hm.values( ));
        return a.size( ) == hm.keySet( ).size( );
    }
}
