package Treees;

class BinarySearchTreeTelsuko
{
    class Node
    {
        int value;
        Node left;
        Node right;
    }

    Node root;

    public void insert(int val)
    {
        root = insertRecursion(root, val);
    }

    public Node insertRecursion(Node node , int val)
    {
        if(node == null)
        {
            return node;
        }
        else if(node.value < val)
        {
            return insertRecursion(node.left, val);
        }
        else if(node.value > val)
        {
            return insertRecursion(node.right, val);
        }
        return node;
    }

    public static void main(String[] args) 
    {
        
    }
}