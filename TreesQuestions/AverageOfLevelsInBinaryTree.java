package TreesQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree 
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
    
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> ans = new ArrayList<>();

        if(root == null)
        {
            return ans;
        }

        /* List<List<Integer>> result = new ArrayList<>(); */

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) 
        {
            int levelSize = queue.size();
            double sum = 0;

            /* List<Integer> list = new ArrayList<>(); */

            for(int i=0;i<levelSize;i++)
            {
                TreeNode current = queue.poll();
                sum = sum + current.val;

                if(current.left != null)
                {
                    queue.offer(current.left);
                }

                if(current.right != null)
                {
                    queue.offer(current.right);
                }
            }
            
            ans.add(sum / levelSize);
        }

        return ans;
    }
}