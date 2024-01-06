import java.util.*;
public class BinaryTree_2Traversal {//Tree Traversal
     static class Node{
        int data;
        Node left;
        Node right;
    
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    static class BinaryTree{
    static int idx =-1;
    public static Node builtTree( int Nodes[]){
        idx ++;
        if(Nodes[idx] ==-1 ){
                return null;
        }
        Node newNode = new Node(Nodes[idx]);
        newNode.left =builtTree(Nodes);
        newNode.right = builtTree(Nodes);

        return newNode;
    }

    public static void preorder(Node root){
        if(root == null){
            return;//not tree can be made as no child is there
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }
}
    public static void main(String[] args) {
        int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.builtTree(nodes);
      //  System.out.println(" root is " + root.data);
        //Node trees = preorder(root);
        tree.preorder(root);
  }
}
}