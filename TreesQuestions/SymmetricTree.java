package TreesQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree 
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

    public static boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) 
        {
            TreeNode lNode = queue.poll();
            TreeNode Rnode = queue.poll();

            if(lNode== null && Rnode == null) 
            {
                continue;
            }

            if(lNode== null || Rnode == null) 
            {
                return false;
            }

            if(lNode.val != Rnode.val)
            {
                return false;
            }

            queue.add(lNode.left);
            queue.add(Rnode.right);
            queue.add(lNode.right);
            queue.add(Rnode.left);

        }
        return true;
    }
}
