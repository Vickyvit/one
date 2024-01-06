//import org.w3c.dom.Node;
import java.util.*;
public class BinaryTree_LCA {
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

    public static void main(String[] args) {
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
        int n1 = 4, n2 =7;
        System.out.print(lca(root, n1, n2).data);
}
    }
}
    
