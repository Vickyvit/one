import java.util.*;

public class BinaryTree_Topview {
       
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node (int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
        //public static void topview(Node root){
           static class info {
            int diam;
            int ht;

            public info(int diam, int ht){
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
               
              int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.ht + rightinfo.ht +1);
              int ht = Math.max(leftinfo.ht, rightinfo.ht);

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
    System.out.println(diameter(root));
    }
}
}
