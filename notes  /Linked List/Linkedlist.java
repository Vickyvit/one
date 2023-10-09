package Linkedlist1;

public  class Linkedlist {
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
    public void addlast(int data){
        Node newnode = new Node(data);
           size ++; 
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
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
    public void addmiddle(int idx, int data){
        if(idx ==0){ //if u want to add the data on head part we'll call add first
            addfirst(data); // because the value of head and tail always change when we call addfirst 
            return; 
        }
        //creating new node
        Node newnode = new Node(data);
           size ++; 
        Node temp =head;// (initially at idx 0 temp points toward head)
        int i =0; //defining idx i from 0
        while(i < idx-1){
            temp =temp.next;
            i++;
        }

        //idx i = idx-1 (temp=prev)
        newnode.next = temp.next; 
        temp.next = newnode;
    }
    public int removefirst(){
     if(size ==0){
        System.out.println(" LL is empty ");
        return Integer.MIN_VALUE;
    }else if (size ==1){
        //head =tail --> we've change its value
         int val =head.data;
        head = tail= null; 
        size =0;
        return val;
    }
    int val =head.data; // value to be deleted i.e head data
    head = head.next; //head value changed to head.next
    size--;
    return val;
}
public int removelast(){
    if(size ==0){
        System.out.println(" LL is empty ");
    }
    else if(size ==1){
    int val = head.data;
    head = tail = null;
    size=0;
    return val;
    }
    Node prev = head;
    for(int i=0; i< size -2 ; i++){
        prev =prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
        
    
    public static void main(String args[]){
        Linkedlist ll =new Linkedlist();
       ll.addfirst(2);
    //  ll.print();
        ll.addfirst(1);
       // ll.print();
        ll.addlast(3);
       ll.addlast(4); 
       ll.addmiddle(0, 0);
       ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
        ll.removelast();
        ll.print();
       System.out.print(ll.size);
    }

}
