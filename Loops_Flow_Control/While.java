package Loops_Flow_Control;


import java.util.*;

//Studying bout while loop rn

public class While {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int val , i = 0 ;
        System.out.println("Enter a number : ");
        val = sc.nextInt();
        while( i < val ){
            System.out.println("Yo wassup mate");
            i++;    //This made the whole thing change and made it recurssive and not infinity.
        }
    }    
}
