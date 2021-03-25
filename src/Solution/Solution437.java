package Solution;

import Structure.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;

public class Solution437{
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> preSum = new HashMap();
        preSum.put(0,1);
        return helper(root, 0, sum, preSum);
    }

    public int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
        if (root == null) return 0;
        currSum += root.val;
        int res = preSum.getOrDefault(currSum - target, 0);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum) - 1);
        return res;
    }
}





////======================
//import java.util.*;
//
//public class Solution437 {
//    public int pathSum( TreeNode root, int sum) {
//        if(root == null) return 0;
//        Queue<HashMap<TreeNode, List<Integer>>> queue = new LinkedList<HashMap<TreeNode, List<Integer>>>(  );
//        HashMap<TreeNode, List<Integer>> rootNode = new HashMap<>(  );
//        List<Integer> rootList = new ArrayList<>( );
//        rootList.add(root.val);
//        rootNode.put(root, rootList);
//        queue.add(rootNode);
//        int res = 0;
//
//        while(!queue.isEmpty()){
//            HashMap<TreeNode, List<Integer>> cur = queue.poll();
//            TreeNode curNode = cur.keySet().iterator().next();
//            List<Integer> curList = cur.get(curNode);
//            System.out.println( curList );
//            for(Integer ele : curList){
//                if(ele == sum) res++;
//            }
//            if(curNode.left != null){
//                List<Integer> leftList = new ArrayList<Integer>(  );
//                for(Integer ele: curList) leftList.add(ele + curNode.left.val);
//                leftList.add(curNode.left.val);
//                HashMap<TreeNode,List<Integer>> left = new HashMap<TreeNode, List<Integer>>(  );
//                left.put(curNode.left, leftList);
//                queue.add(left);
//            }
//            if(curNode.right != null){
//                List<Integer> rightList = new ArrayList<Integer>(  );
//                for(Integer ele: curList) rightList.add(ele + curNode.right.val);
//                rightList.add(curNode.right.val);
//                HashMap<TreeNode, List<Integer>> right = new HashMap<TreeNode, List<Integer>>(  );
//                right.put(curNode.right, rightList);
//                queue.add(right);
//            }
//        }
//        return res;
//    }
//}
