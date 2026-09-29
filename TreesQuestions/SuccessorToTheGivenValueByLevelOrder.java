package TreesQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class SuccessorToTheGivenValueByLevelOrder 
{
    public class TreeNode 
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

    public static int successor(TreeNode root, int value)
    {
        if(root == null)
        {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty())
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

            if(current.val == value)
            {
                if(queue.peek() != null)
                {
                    return queue.peek().val;
                }
                else
                {
                    return 0;
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) 
    {
        
    }
}
