public class IsValidBST 
{
    class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val,TreeNode left,TreeNode right){this.val = val; this.left = left; this.right = right;}
    }

    public boolean IsValidBSTTree(TreeNode root)
    {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node , Integer low , Integer high)
    {
        if(node == null) {
            return true;
        }

        if(low != null && node.val <= low) {
            return false;
        }


        if(high != null && node.val >= high) {
            return false;
        }

        boolean leftResult = helper(node.left, low, node.val);
        boolean rightResult = helper(node.right, node.val, high);

        return leftResult && rightResult;


    }
}