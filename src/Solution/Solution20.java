package Solution;

import java.util.*;

public class Solution20 {
    public boolean isValid(String s){
        if(s.length() == 0) return true;

        Stack<Character> bracketStack = new Stack<Character>();
        char cur;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' |s.charAt(i) == '{' | s.charAt(i) == '[') bracketStack.push(s.charAt(i));
            else if(bracketStack.empty()) return false;
            else {
                cur = bracketStack.pop();
                if(cur == '(' & s.charAt(i) != ')') return false;
                if(cur == '{' & s.charAt(i) != '}') return false;
                if(cur == '[' & s.charAt(i) != ']') return false;
            }
        }
        return bracketStack.empty();
    }
}
