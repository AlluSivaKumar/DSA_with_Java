package TreesQuestions;

import java.util.Queue;
import java.util.*;

/**
 * TreeNodeSuccessorBFS
 */
public class TreeNodeSuccessorBFS {

    public static class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode findSuccessor(TreeNode root , int key)
    {
        if(root == null)
        {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);

        while (!queue.isEmpty())
        {
            int levelSize =  queue.size();

            for(int i=0;i<levelSize;i++)
            {
                TreeNode current = queue.poll();

                if(current.left != null)
                {
                    queue.offer(current.left);
                }

                if(current.right != null)
                {
                    queue.offer(current.right);
                }
                
                if(current.val == key)
                {
                    return queue.peek();
                }
            }
        }

        return null;
    }
}