package Solution;

public class Solution557 {
    public String reverseWords(String s) {
        String[] sString = s.split(" ", -1);
        StringBuilder res = new StringBuilder(  );
        String prefix = "";
        for(String ele: sString){
            res.append(prefix);
            prefix = " ";
            StringBuilder cur = new StringBuilder(  );
            res.append(cur.append(ele).reverse());
        }
        return res.toString();
    }
}
