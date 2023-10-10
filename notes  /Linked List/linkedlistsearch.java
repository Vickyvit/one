package Linkedlist1;
//import Linkedlist1.Linkedlist;

public class linkedlistsearch {
    public static class Node{
        int data;
        Node next;
    
     public Node(int data) {
        this.data =data;
        this.next =null;
        }
     }   
    public static Node head;
    public static Node tail;
     public static int size;

    public void addfirst (int data){

        //s1- creating new node
        Node newnode = new Node(data);
         size ++;           //if my head is null (last step -base case)
        if(head == null){
            head = tail = newnode;
            return;
        }
        //s2 -- linking
        newnode.next = head;// linking of node occurs by pointing next toward another node head

        //s3 = nhead = newnode
        // head is pointing towars new node
        head = newnode;
    }
        public void print(){
            //base case 
            if ( head == null){
                System.out.print(" LL is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " - ");
                temp = temp.next; // temp udate
            }
            System.out.println("null");
    }
    public int itersearch( int key){
        // Node newnNode = new Node(key);
         Node temp = head;
         int i= 0; //index
         
         while(temp != null){
             if(temp.data == key){ //key found case
                 System.out.print(" key found at index i = ");
                 return i;
             }
             temp = temp.next;
             i++;
         }
         return -1; // key not found case
     }

     public int helper(Node head,int key){
        if(head == null){
            return -1; //key not found in the entire linked list
        }
        if(head.data == key){
            return 0; //key found
        }
        //now we've to return the index
        int idx = helper(head.next, key); //looking for other nos matching the key
        if(idx == -1){
            return -1; //another key not found 
        }/*else {
             System.out.println(idx +" another idx ");
        }*/
        return idx+1; // locating the orginal index wrt to original head
    }
    public int recursearch(int key){
        return helper(head, key);
    }
      public static void main(String args[]){
        linkedlistsearch ll =new linkedlistsearch();
       ll.addfirst(2);
       ll.addfirst(5);
       ll.addfirst(2);
       ll.addfirst(3);
       ll.addfirst(6);
       ll.addfirst(1);
        ll.addfirst(0);
       ll.print();
      System.out.println(ll.recursearch(4));
         System.out.println(ll.recursearch(2));
          //System.out.println(ll.recursearch(2));
       //System.out.println(ll.itersearch(7));
        }
    }     
    
    
    
    
    
    
    
    
    
    
    
    
    /* 
     public int helper(Node head, int key){
        if(head == null){
            return -1; //base case
        }
        if(head.data == key){
            return 0; //jb bhi key head.data ke equal hoga to  haa index 0 hoga
        }
        int idx =helper(head.next, key); //to track key in other index in LL
        if(idx == -1){
            return -1;// NOT FOUND
        }
        return idx + 1 ; //IF FOUND
     }
     
     public int recursearch(int key){
    //     Node newNode = new Node(key);
    //         if(head.data == key){
    //             return 0;
    //         }
    //         recursearch(key)
    //  }
             return helper(head, key);
     }*/