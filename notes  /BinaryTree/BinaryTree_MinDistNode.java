import java.util.*;
public class BinaryTree_MinDistNode {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node (int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    
    
    public static Node lca(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root; //return main root
        }
        Node leftlca= lca(root.left, n1, n2); //find lca in left and right subtree
        Node rightlca = lca(root.right, n1, n2);

        //Assume left lca value = valid & right lca value = null 
        if(rightlca == null){
            return leftlca;
        } 
         if(leftlca == null){
            return rightlca;
        }
        
        return root;
    }
    public static int lca_dist(Node root, int n){
        if( root == null){
            return -1;

        }
        if(root.data ==n){
            return 0;
        }
        int leftdist = lca_dist(root.left, n);
        int rightdist = lca_dist(root.right, n);

        if(leftdist == -1 && rightdist ==-1){
            return -1;
        }else if (leftdist == -1){
            return rightdist +1;
        }else{
            return leftdist +1;
        }

    }

    public static int min_dist(Node root, int n1, int n2){
        //if(root.data ==n1 )
        Node lca2 = lca(root, n1, n2);
        int  n1_d = lca_dist(lca2, n1);
        int  n2_d = lca_dist(lca2, n2);
        return n1_d + n2_d;
    }





    public static void main(String[] args) {
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    int n1 =4 , n2 =5;
        System.out.print(min_dist(root, n1, n2));

}
    }
}
