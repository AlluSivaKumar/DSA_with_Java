public class BinarySearchTree 
{
    public BinarySearchTree()
    {

    }

    public class Node
    {
        private int value;
        private Node left;
        private Node right;
        int height;

        public Node(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return this.value;
        }
    }

    private static Node root;

    public int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void display()
    {
        display(this.root , "Root Node : ");
    }

    private void display(Node node , String details)
    {
        if(node == null)
        {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left , "Left child of " + node.getValue() + " : ");
        display(node.right , "Right child of " + node.getValue() + " : ");
    }


    public Node insert(int value)
    {
        root = insert(value , root);
        return root;
    }

    private Node insert(int value , Node node)
    {
        if(node == null)
        {
            node = new Node(value);
            return node;
        }

        if(value < node.getValue())
        {
            node.left = insert(value , node.left);
        }

        if(value > node.getValue())
        {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean isBalanced()
    {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node)
    {
        if(node == null)
        {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            this.insert(nums[i]);
        }
    }


    public void populateSorted(int[] nums)
    {
        populateSorted(nums, 0 , nums.length-1);
    }


    private void populateSorted(int[] nums, int start , int end)
    {
        if(start > end)
        {
            return ;
        }
        int mid = start + (end-start)/2;
        this.insert(nums[mid]);
        populateSorted(nums, 0, mid - 1);
        populateSorted(nums, mid+1, end);
    }

    //PREORDER
    //ROOT - LEFT - RIGHT
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //INORDER
    //LEFT - ROOT - RIGHT
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node node)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);   
    }

    //POSTORDER
    //LEFT - RIGHT - ROOT
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node node)
    {
        if(node ==  null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public void prettyDisplay()
    {
        prettyDisplay(root , 0);
    }

    public void prettyDisplay(Node node, int level)
    {
        if(node == null)
        {
            return;
        }
        prettyDisplay(node.right, level+1);

        if(level !=0 )
        {
            for(int i=0;i<level-1;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        }
        else
        {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level+1);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // tree.insert(34);
        // tree.insert(12);
        // tree.insert(13);
        // tree.insert(98);
        // tree.insert(56);
        // tree.insert(67);

        //tree.populate(new int[] {2,8,9,3,1});

        tree.populate(new int[] {4,1,2,20,6,3,7});

        System.out.println(tree.isBalanced());
        //tree.display();

        // tree.preorder();
        // System.out.println();
        // tree.inorder();
        // System.out.println();
        // tree.postorder();

        //tree.display();

        System.out.println(tree);
    }
}
