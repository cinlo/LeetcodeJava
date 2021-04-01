package Solution;

public class Solution541 {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder(  );
        int start = 0, end = Math.min(start + k, s.length());
        while(start < s.length()){
            StringBuilder sub = new StringBuilder(  );
            sub.append(s, start, end);
            sub.reverse();
            res.append(sub);
            start = end;
            end = Math.min(start + k, s.length());
            res.append(s,start,end);
            start = end;
            end = Math.min(start + k, s.length());
        }
        return res.toString();
    }
}
