package Treees;

public class BST 
{
    public BST() 
    {

    }

    class Node
    {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val)
        {
            this.val =  val;
        }

        public int getValue()
        {
            return val;
        }
        
    }

    public int height(Node node)
    {
        return node.height;
    }

    public Node root;

    public boolean isEmpty()
    {
        return root == null;
    }

    public Node insert(int val)
    {
        return insert(val, root);
    }

    private Node insert(int val, Node node)
    {
        if(node == null)
        {
            node = new Node(val);
            return node;
        }

        if(val < node.val)
        {
            node.left = insert(val,node.left);
        }

        if(val > node.val)
        {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    
}
