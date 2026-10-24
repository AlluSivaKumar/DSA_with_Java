package TreesQuestions;

public class DiameterOfBinaryTree 
{
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val,TreeNode left,TreeNode right){this.val = val; this.left = left; this.right = right;}
    }

    int diameter = 0;
    public int diameter(TreeNode root)
    {
        height(root);
        return diameter;
    }

    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int dia = leftHeight + rightHeight;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}