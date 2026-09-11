public class AvlTrees 
{
    public AvlTrees() {
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;
        int height;
        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    private static Node root;

    public static int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root , "Root Node : ");
    }

    private void display(Node node , String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left , "Left child of " + node.getValue() + " : ");
        display(node.right , "Right child of " + node.getValue() + " : ");
    }


    public Node insert(int value) {
        root = insert(value , root);
        return root;
    }

    private Node insert(int value , Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.getValue()) {
            node.left = insert(value , node.left);
        }

        if(value > node.getValue()) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    public static Node rotate(Node node)
    {
        if(height(node.left) - height(node.right) > 1)
        {
            //LEFT HEAVY
            if(height(node.left.left) - height(node.left.right) >= 0)
            {
                //LEFT LEFT
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0)
            {
                //LEFT RIGHT
                node.left = leftRotate(node.left);
                return rightRotate(node);
                
            }
        }

        if(height(node.left) - height(node.right) < -1)
        {
            //RIGHT HEAVY
            if(height(node.right.left) - height(node.right.right) < 0)
            {
                //RIGHT RIGHT
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0)
            {
                //RIGHT RIGHT
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

        }
        return node;
    }

    public static Node rightRotate(Node p)
    {
        Node c = p.left;
        Node t = p.left.right;

        c.right = p;

        p.left = t;

        
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max((height(c.left)), height(c.right)) + 1;

        return c;
    }

    public static Node leftRotate(Node p)
    {
        Node c = p.right;
        Node t1 = p.left;
        Node t2 = p.right.left;

        c.left = p;
        c.left.left = t1;
        c.left.right = t2;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }


    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node == null)
        {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            this.insert(nums[i]);
        }
    }

    public int height()
    {
        if(root == null)
        {
            return -1;
        }
        return height(root);
    }


    public static void main(String[] args) {
        AvlTrees tree = new AvlTrees();

        tree.populate(new int[] {4,1,2,20,6,3,7});

        tree.display();

        System.out.println(tree.isBalanced());
        System.out.println(tree.height());
    }
}
