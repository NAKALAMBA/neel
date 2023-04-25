package Linked_Lists;

import java.util.*;

public class Five {
    public static void main ( String args[] ){
        ArrayList < Integer > OBJ = new ArrayList<>();
        OBJ.add(90);
        OBJ.add(80);
        OBJ.add(70);
        OBJ.add(60);
        OBJ.add(50);
        OBJ.add(40);
        OBJ.add(30);

        System.out.println(OBJ);

        //Delete an Element from the ArrayList .
        int NumDel = OBJ.remove(0);
        System.out.println("Removed Element is : ");
        System.out.print(NumDel);


        //Display all The Item's Horizontally...
        Iterator itr =OBJ.iterator();
        System.out.println("ArrayList : ");
            while ( itr.hasNext() ) {
            System.out.println(itr.next());
        }
    }
}
