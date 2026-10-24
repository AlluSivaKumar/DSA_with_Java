package TreesQuestions;
import java.util.*;

/**
 * TreeZigZagLevelOrderBFS
 */
public class TreeZigZagLevelOrderBFS {

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


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null)
        {
            return list;
        }

        Deque<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        boolean reverse = false;

        while (queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> inner = new ArrayList<>();

            if(!reverse)
            {
                for(int i=0;i<levelSize;i++)
                {
                    TreeNode current = queue.pollFirst();

                    inner.add(current.val);

                    if(current.left != null)
                    {
                        queue.addLast(current.left);
                    }

                    if(current.right != null)
                    {
                        queue.addLast(current.right);
                    }
                }

            }
            else
            {
                for(int i=0;i<levelSize;i++)
                {
                    TreeNode current = queue.pollLast();

                    if(current.right != null)
                    {
                        queue.addFirst(current.right);
                    }

                    if(current.left != null)
                    {
                        queue.addFirst(current.left);
                    }
                }
                reverse = !reverse;
            }
            list.add(inner);
        }

        return list;
    }
}