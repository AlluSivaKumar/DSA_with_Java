package TreesQuestions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigZagLevelOrderTraversal 
{
    public class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() 
        {
        }
        TreeNode(int val) 
        { 
            this.val = val; 
        }
        TreeNode(int val, TreeNode left, TreeNode right) 
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null)
        {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean reverse = false;

        while(!deque.isEmpty()) 
        {
            int levelSize = deque.size();

            List<Integer> list = new ArrayList<>();

            if(reverse == false)
            {
                for(int i=0;i<levelSize;i++)
                {
                    TreeNode current = deque.pollFirst();
                    list.add(current.val);
                    if(current.left != null)
                    {
                        deque.addLast(current.left);
                    }
                    if(current.right != null)
                    {
                        deque.addLast(current.right);
                    }
                }
            }
            else
            {
                for(int i=0;i<levelSize;i++)
                {
                    TreeNode current = deque.pollLast();
                    list.add(current.val);
                    if(current.right != null)
                    {
                        deque.addFirst(current.right);
                    }
                    if(current.left != null)
                    {
                        deque.addFirst(current.left);
                    }
                }
            }

            reverse = !reverse;

            result.add(list);
        }

        return result;
    }

}
