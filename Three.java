package Linked_Lists;



/*
 *      Linked List Following Example . 
 */


import java.util.*;

public class Three {
    public static void main ( String args[] ){
        //Creating list using the linkedlist class
        LinkedList <Integer> Obj = new LinkedList<>();
        Obj.add(1);
        Obj.add(2);
        Obj.add(3);
        System.out.println("List is : " + Obj );

        //Access The Element from the list..
        int Index = Obj.get(2);
        System.out.println("Accessed Element is : " + Index );

        //Using the IndexOf() method 
        int val = Obj.indexOf(1);
        System.out.println("First occurance of 1 is at index : " + val );

        //Remove an elemnt from the list.
        int RemoveNum = Obj.remove(0);
        System.out.println("Removed Element Guy's : " + RemoveNum );

        Iterator itr = Obj.iterator();
        System.out.println("Updated List : ");
        while( itr.hasNext() ){
            System.out.println(itr.next());
        }
    }
}
