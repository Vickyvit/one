import java.util.*;
public class BinaryTree_4LevelOrder {
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
    
     public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

        while(!q.isEmpty()){//check till q becomes empty
               Node currNode = q.remove();//and remove each element one by one
               
        if(currNode == null){//Operations on currnode Satart here
                System.out.println();//null mile toh next line print krdo

                if(q.isEmpty()){//null NIKALA HAMRE NET NODE ME ISKA MLTB KI QUEUE HAMARI EMPTY HO GYI HAI QUEUE SE ELEMTS SAARE BAHAR AAYGE AND GETS PRINTED IT MEANS ITS OUR LAST NODE  ko queue se bahar nikal liya hai and q bhi empty ho gya IT MEANS NO ELEMNTS LEFT IN THE QUEUE
                    break;
                }else{
                    q.add(null);//IF QUEUE IS NOT EMPTY THEN RETUURN NULL BACK INTO THE QUEUE
                }
        }else{ //IF NULL BAHAR NHI NIKLI HAI QUESE SE TOH USS DATA KO PRINT KRLENGE
                System.out.print(currNode.data + "  ");

                //NOW CHECK IF LEFT CHILD IS EMPTY OR NOT IF IT IS NOT THEN ADD IT TO THE QUEUE
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
             }

            }
            
     }
}

    public static void main (String args[]){
        int nodes [] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.builtTree(nodes);
        tree.levelOrder(root);
    }
}
}
