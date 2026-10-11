package TreesQuestions;

import java.util.List;
import java.util.Queue;

/**
 * AvgOfLevelsBFS
 */
public class AvgOfLevelsBFS {

    class TreeNode
    {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val,int left,int right) {this.val = val; this.left = left; this.right = right;}
    }

    public static List<Double> avgOfLevels(TreeNode root)
    {
        List<Double> list = new ArrayList<>();

        if(root == null)
        {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) 
        {
            int levelSize = queue.size();

            //List<Integer> inner = new ArrayList<>(levelSize);
            int sum = 0;

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

            double avg = sum / levelSize;
            list.add(avg);
        }
        return list;

    }
}