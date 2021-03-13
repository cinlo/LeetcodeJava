package Structure;

public class TreeNode {
    public TreeNode left, right;
    public int val;

    public TreeNode( int val ) {
        this.val=val;
    }

    public TreeNode arrayToTree( Integer[] input ) {
        TreeNode root=createTreeNode(input, 1);
        return root;
    }

    private TreeNode createTreeNode( Integer[] input, int index ) {
        if( index<=input.length ) {
            Integer value=input[ index - 1 ];
            if( value != null ) {
                TreeNode t=new TreeNode(value);
                t.left=createTreeNode(input, index * 2);
                t.right=createTreeNode(input, index * 2 + 1);
                return t;
            }
        }
        return null;
    }
}