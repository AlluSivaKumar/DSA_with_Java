package TreesQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal 
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

    public static List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> resultList = new ArrayList<>();

        //IF TREE IS EMPTY RETURN THE EMPTY LIST
        if(root == null)
        {
            return resultList;
        }

        //CREATE A QUEUE TO ADD TREE NODES LEVELWISE
        Queue<TreeNode> queue = new LinkedList<>();

        //FIRST ADD ROOT NODE
        queue.offer(root);

        //USE LOOP TO PRINT ALL QUEUE ELEMENTS LEVEL WISE
        while(!queue.isEmpty())
        {
            // Store the number of nodes in the current level.
            // This helps us process only the current level's nodes.
            int levelSize = queue.size();

            List<Integer> list = new ArrayList<>();

            for(int i=0;i<levelSize;i++)
            {
                //REMOVING FIRST ITEM IN QUEUE AND STORE IT IN CURRTREENODE
                TreeNode currTreeNode = queue.poll();
                list.add(currTreeNode.val);

                //IF CURRENT NODE LEFT IS NOT NULL
                if(currTreeNode.left != null)
                {
                    queue.offer(currTreeNode.left);
                }

                //IF CURRENT NODE RIGHT IS NOT NULL
                if(currTreeNode.right != null)
                {
                    queue.offer(currTreeNode.right);
                }
            }

            //ADDING CURRENT LIST TO RESULT LIST
            resultList.add(list);
        }
        

        return resultList;
    }
    
}
