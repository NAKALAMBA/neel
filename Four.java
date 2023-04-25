package Linked_Lists;

import java.util.*;
import java.util.ArrayList;
public class Four{
public static void main(String args[]){
        ArrayList<String> animals = new ArrayList<String>();  // creating array list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        
        Iterator itr=animals.iterator();
        System.out.println("Array List : ");

            while(itr.hasNext()){
            System.out.println(itr.next());
        }

        String a1 = animals.get(2);                   // Access element from the list 
        System.out.println("Accessed Element: " + a1);
        System.out.println(animals);

        String r = animals.remove(1);                // Remove element from the list
        System.out.println("Removed Element: " + r);
        System.out.println(animals);
        animals.set(1,"Cow");           // Changing element in the list
        System.out.println("Array List with Modified Element: " + animals);
        }
    }
