import java.util.*;
public class BinaryTree_6KthANCESTOR {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node (int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }

        public static int kthAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int leftdis = kthAncestor(root.left, n, k);
            int rightdis = kthAncestor(root.right, n, k);

            
            if(leftdis ==-1 && rightdis == -1){
                return -1;
            }
            int max = Math.max(leftdis, rightdis);
            if(max +1 == k){
                System.out.println(root.data);
            }
            return max+1;
        }
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            int n =5 , k =2;
            kthAncestor(root, n, k);

        }
    }

}
