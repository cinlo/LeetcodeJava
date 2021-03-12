package Solution;

import Structure.TreeNode;
import java.util.*;

public class Solution107{
    public List<List<Integer>> levelOrderBottom( TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        if(root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i = 0; i< levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            res.add(0, subList);
        }
        return res;
    }
}


//
//import Structure.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution107 {
//    public List<List<Integer>> levelOrderBottom( TreeNode root ){
//        if(root == null) return new ArrayList<List<Integer>>( );
//        List<TreeNode> curLevel = new ArrayList<TreeNode>( );
//        curLevel.add(root);
//        List<List<TreeNode>> treeList =new ArrayList<List<TreeNode>>( );
//        treeList.add(curLevel);
//
//        int i = 0;
//        List<TreeNode> nextLevel = new ArrayList<>(  );
//
//        while(i < curLevel.size()){
//            if(curLevel.get(i) != null && !(curLevel.get(i).left == null & curLevel.get(i).right == null)) {
//                nextLevel.add(curLevel.get(i).left);
//                nextLevel.add(curLevel.get(i).right);
//            }
//            i++;
//            if(i == curLevel.size()){
//                if(nextLevel.size() == 0) break;
//                treeList.add(nextLevel);
//                curLevel = nextLevel;
//                nextLevel = new ArrayList<>(  );
//                i = 0;
//            }
//        }
//
//        List<List<Integer>> res = new ArrayList<List<Integer>>( );
//        List<Integer> temp = new ArrayList<Integer>(  );
//        for(int m = treeList.size(); m >= 0 ; m--){
//            temp = new ArrayList<Integer>(  );
//            for(int n = 0; n < treeList.get(m).size() - 1; n ++){
//                if(treeList.get(m).get(n) != null) temp.add(treeList.get(m).get(n).val);
//            }
//            res.add(temp);
//        }
//        return res;
//    }
//}
