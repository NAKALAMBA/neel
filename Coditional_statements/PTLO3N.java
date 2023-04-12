package Coditional_statements;



import java.util.*;

//Print The Largest Of 3 Numbers is the question 
//So lett's start without any delay


public class PTLO3N {
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in );
        int a , b , c ;
        System.out.print("Enter the value of A : " );
        a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        b = sc.nextInt();
        System.out.print("Enter the value of C : ");
        c = sc.nextInt();
        if ( a > b && a > c ){
            System.out.println(" A is the greatest of all ");
        }else if ( b > a && b > c ){
            System.out.println(" B is the greatest of all ");
        }else{
            System.out.println(" C is the greatest of all ");
        }
    }
}
