package TreesQuestions;

import java.util.*;

/**
 * BFS
 */
public class BFS {

    class TreeNode
    {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val,int left,int right) {this.val = val; this.left = left; this.right = right;}
    }


    public static List<List<Integer>> bfs(TreeNode root)
    {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null)
        {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty())
        {
            int levelSsize = queue.size();
            List<Integer> inner = new ArrayList<>();

            for(int i=0;i<levelSsize;i++)
            {
                TreeNode current = queue.poll();

                inner.add(current.val);

                if(current.left != null)
                {
                    queue.add(current.left);
                }
                if(current.right != null)
                {
                    queue.add(current.right);
                }
            }

            list.add(inner);
        }

        return list;
    }

    
}