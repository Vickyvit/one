import java.util.*;

public class binarytree_summary {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
        
        // Queue <Integer> q = new LinkedList<>();
        // q.add(root);
        // q.add(null);
        static int idx =-1;
        public static void levelOrder(){
            idx++;
            if(idx == 0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
