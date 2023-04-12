package Coditional_statements;


import java.util.*;

//Is The Number Even Or Odd Is The Question.

public class EOO {
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in );
        int a , b , sum ;
        System.out.print("Enter the 1st number : ");
        a = sc.nextInt();
        System.out.print("Enter the 1st number : ");
        b = sc.nextInt();
        sum = a + b ;
        if (  sum % 2 == 0  ){
            System.out.println("The number is EVEN ");
        }else{
            System.out.println( "The number is ODD ");
        }
    }
}
