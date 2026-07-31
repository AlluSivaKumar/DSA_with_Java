package LeetCode;

public class LeetCode100 
{
    public class TreeNode {
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


      public static void main(String[] args) 
      {
        
      }

    public static boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p.val != q.val)
        {
            return false;
        }
        if(p.left.val != q.left.val)
        {
            return false;
        }
        if(p.right.val != q.right.val)
        {
            return false;
        }
        boolean ans1 = isSameTree(p.left, q.left);
        boolean ans2 = isSameTree(p.right, q.right);

        return ans1 && ans2;
    }
  }
}
