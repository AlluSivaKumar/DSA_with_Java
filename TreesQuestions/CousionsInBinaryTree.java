package TreesQuestions;
class CousionsInBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {this.val = val;}
        public TreeNode(int val,TreeNode left,TreeNode right){this.val = val; this.left = left; this.right = right;}
    }
    public boolean isCousions(TreeNode root, int x, int y) {
        TreeNode xnode = findNode(root,x);
        TreeNode yNode = findNode(root,y);
        if (xnode == null || yNode == null) {
            return false;
        }
        return (!isSibilings(root, xnode, yNode)) && (level(root, xnode, 0) == level(root,yNode, 0));
    }
    public TreeNode findNode(TreeNode node, int val) {
        if(node == null) {
            return null;
        }
        if(node.val == val) {
            return node;
        }
        TreeNode n = findNode(node.left, val);
        if(n != null) {
            return n;
        }
        return findNode(node.right, val);
    }
    public boolean isSibilings(TreeNode node, TreeNode lNode, TreeNode rNode) {
        if(node == null) {
            return false;
        }
        return ((node.left == lNode && node.right == rNode) || (node.left == rNode && node.right == lNode) || isSibilings(node.left, lNode, rNode) || isSibilings(node.right, lNode, rNode));
    }
    public int level(TreeNode node, TreeNode x, int lev) {
        if(node == null) {
            return -1;
        }
        if(node == x) {
            return lev;
        }
        int l = level(node.left, x, lev + 1);
        if(l != -1) {
            return l;
        }
        return level(node.right, x, lev + 1);
    }
}