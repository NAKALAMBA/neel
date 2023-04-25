package Linked_Lists;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;



public class Six {


public static void Swap( ArrayList<Integer> obj , int idx1 , int idx2 ){
    int temp = obj.get( idx1 );
    obj.set( idx1 , obj.get ( idx2 ) );
    obj.set( idx2 , temp );
}



    public static void main ( String args[] ){
        Vector <String> Mam = new Vector<>();
        Mam.add("Hi");
        Mam.add("Hello");
        Mam.add("Adios");
        Mam.add("Senior");
        Mam.add("By La Mos");

        ArrayList < Integer > obj = new ArrayList<>() ;
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(5);
        obj.add(70);
        obj.add(90);



        Iterator itr = Mam.iterator();
        System.out.println("Elements there : ");
        while(itr.hasNext() ){
            System.out.println(itr.next());
        }


            String Rem = Mam.remove(0);
            System.out.println("Removing The 0th element : " + Rem );

            System.out.println(Mam.size());

            for(int i = 0 ; i < Mam.size() ; i++ ){
                System.out.println(Mam.get(i) + " ");
            }
            System.out.println();


            //Reverse Print
            for(int i = Mam.size() - 1  ; i >= 0  ; i-- ){
                System.out.println(Mam.get(i));
            }


            // Find The Max Number Out of the Array
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < obj.size() ; i++ ){
//                if( max < obj.get(i)){
  //                  max = obj.get(i);
    //            }else{
            max = Math.max (max , obj.get(i));
                 // System.out.println("There are Porbabalye No numebrs Dude ");
        //        }
            }
            System.out.println();
        System.out.println("Max Element is : " + max );


            int idx1 = 1 , idx2 = 3 ;
            System.out.println(obj);
            Swap(obj, idx1, idx2);
            System.out.println(obj);


            // Sorting An ArrayList.
            Collections.sort(obj);
            System.out.println();
            System.out.println("The Ascending Sorted Array boi : ");
            System.out.println(obj);



            Collections.sort(obj , Collections.reverseOrder());
            System.out.println();
            System.out.println("The Descending Sorted Array boi : ");
            System.out.println(obj);
    }
}