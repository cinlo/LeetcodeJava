package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//===simplify
public class Solution884{
    public String[] uncommonFromSentences(String A, String B){
        String AB = A + " " + B;
        String[] wordArray = AB.split(" ");
        HashMap<String, Boolean> hm = new HashMap<String, Boolean>(  );
        for(String ele: wordArray){
            if(!hm.containsKey(ele)) hm.put(ele,true);
            else hm.put(ele,false);
        }
        ArrayList<String> res = new ArrayList<>(  );
        for(String ele: hm.keySet()){
            if(hm.get(ele)) res.add(ele);
        }
        return res.toArray(new String[0]);
    }
}


//
////===1 solution
//public class Solution884 {
//    public String[] uncommonFromSentences(String A, String B) {
//        String[] wordArray1 = A.split(" ");
//        String[] wordArray2 = B.split(" ");
//        HashMap<String, Boolean> hm = new HashMap<String, Boolean>(  );
//        for(String ele: wordArray1){
//            if(!hm.containsKey(ele)){
//                hm.put(ele,false);
//            }
//            else{
//                hm.put(ele,true);
//            }
//        }
//        for(String ele: wordArray2){
//            if(!hm.containsKey(ele)){
//                hm.put(ele,false);
//            }
//            else{
//                hm.put(ele, true);
//            }
//        }
//
//        List<String> res = new ArrayList<String>(  );
//        for(String ele: hm.keySet()){
//            if(!hm.get(ele)){
//                res.add(ele);
//            }
//        }
//        String[] resArray = new String[res.size()];
//        for(int i = 0; i < res.size(); i++) resArray[i] = res.get(i);
//        return resArray;
//    }
//}
