public class BinaryTree_5Hgt_sum_count {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public static int height (Node root){
            if(root == null){
                    return 0;
            }
            int ln = height(root.left);
            int rn = height(root.right);
            return Math.max(ln, rn) +1;

        }
        public static int sum (Node root){
            if(root == null){
                return 0;
            }
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum+rsum+root.data;
        }
    
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount + rcount +1;
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
       // System.out.println(height(root));
        System.out.println("sum of nodes " +sum(root ));
        System.out.println("total no. of nodes" + count(root));
    }
}
}
