package Loops_Flow_Control;


import java.util.*;

//Print the numbers from 1 to N .

public class PNF1tN {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int i , val ;
        System.out.print("Enter a number : ");
        val = sc.nextInt();
        for( i = 1 ; i <= val ; i++ ){
            System.out.println(i);
        }
    }
}
