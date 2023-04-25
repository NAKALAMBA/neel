package Linked_Lists;

import java.util.LinkedList;

/*
 *      Head and Tail of a Linked List...</>
 *      We are Doing a constant time operation in this program so the time is 0 ( 1 )
 */



public class Two {
    public static class Node{
        int data ;
        Node next ;
        public Node ( int data ){
            this.data = data ;
            this.next = null ;
        }
    }

//Methods
//First lets chek out the add Function...
        public void  AddFirst ( int data ){

                //Step 1 create new node ;
                Node NewNode = new Node(data);

        if(head == null ){
            head = tail = NewNode ;
            return ;
}

            //Step 2 NewNode ke next Mai Assign karo Head ko ;
            NewNode.next = head ;   //Linker 

            //Step 3 Head Ka value ban jaye abhi naya Node ;
            head = NewNode ;

    }



    public void  AddLast ( int data ){
    Node NewNode = new Node ( data ) ;
    
    if ( head == null ){
        head = tail = NewNode ;
        return ;
    }
    
    tail.next = NewNode ;

    tail = NewNode ;
    }



    public static Node head ;
    public static Node tail ;


public void Print(){
    if ( head == null ){
        System.out.println("LL is Empty");
        return ;
    }
    Node temp = head ;
    while ( temp != null ){
        System.out.println(temp.data + " -> ");
        temp = temp.next ;
    }
    System.out.println("null");
}




    public static void main ( String args[] ){
        LinkedList ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}
