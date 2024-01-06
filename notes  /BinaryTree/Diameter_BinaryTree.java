//T C O(n2) because on while going to each node we are  calc the height twice of each node
public class Diameter_BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;
    
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int l_ht = height(root.left);
    int r_ht = height(root.right);
    return Math.max(l_ht, r_ht)+1;
}

public static int diameter (Node root){
    if(root == null){
        return 0;
    }
    int l_height = height(root.left);
    int r_height = height(root.right);
    int l_diam = diameter(root.left);
    int r_diam = diameter(root.right);

    int self_diam = l_height + r_height +1 ;
    return Math.max(self_diam,Math.max(r_diam, l_diam));//1st land r diam would be calc then it finds max with self diam
    //return Math.max(l_diam, r_diam);
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
