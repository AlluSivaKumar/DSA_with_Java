package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 
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

      TreeNode root;
    }

    public static List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> list = new  ArrayList<>();
        preorderTraversal(list, root);
        return list;
    }

    private static void preorderTraversal(List<Integer> list, TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        list.add(node.val);
        preorderTraversal(list , node.left );
        preorderTraversal(list , node.right);
    }
  
    public static void main(String[] args) 
    {
        
    }

    
}
