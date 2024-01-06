public class Binarytree_Preorder{
    static class Node{//things we want to store in nodes
        int data;
        Node left;
        Node right;
    
    //constructors for node class
    Node(int data){
        this.data = data;
        this.left= null;
        this.right = null;
    }
}
        //class for binary tree
        static class BinaryTree{
        static int idx = -1; //static because for each recursion we want our id to get update 1 -> 2 and so on...
        public static Node buildTree(int nodes[]){
            //we'll return node means we would return root of tree here
            //to do so we'll go through each id and make nodes through that
            idx ++; //creation of 1st node occured here as id move from -1 to 0
            if(nodes[idx] ==-1){
                return null;
            }
            Node newnNode = new Node(nodes[idx]);
            newnNode.left = buildTree(nodes);
            newnNode.right = buildTree(nodes);
            //here we're recursively assuming buildtree fn would build left and right node for me
            return newnNode;
    }       
        }
   
    public static void main(String[] args) {
        int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println( root.data + " is the root of the  tree");
    }
}