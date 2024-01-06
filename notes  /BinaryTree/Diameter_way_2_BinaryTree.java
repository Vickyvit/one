
public class Diameter_way_2_BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        // public static int height(Node root){
        //     if(root == null){
        //         return 0;
        //     }
        //     int l_ht = height(root.left);
        //     int r_ht = height(root.right);
        //     return Math.max(l_ht, r_ht)+1;
        // }
        // public static int diameter2 (Node root){
        //     if(root == null){
        //         return 0;
        //     }
        //     int l_height = height(root.left);
        //     int r_height = height(root.right);
        //     int l_diam = diameter2(root.left);
        //     int r_diam = diameter2(root.right);
        
        //     int self_diam = l_height + r_height +1 ;
        //     return Math.max(self_diam,Math.max(r_diam, l_diam));//1st land r diam would be calc then it finds max with self diam
    }   
    static class info {
            int diam;
            int ht;

            public info (int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
    }
    public static info diameter(Node root){
        if(root == null){
            return new info(0, 0);
        }
        info leftinfo = diameter(root.left);
        info rightinfo = diameter(root.right);
        int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam) , leftinfo.ht + rightinfo.ht +1);
        int ht = Math.max(leftinfo.ht ,rightinfo.ht ) +1;
        return new info(diam, ht);
    }



     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root).diam);//this time what diameter function would return that would be an object type.
        System.out.println(diameter(root).ht);
    }
}
