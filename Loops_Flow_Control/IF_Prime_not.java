package Loops_Flow_Control;



import java.util.*;



public class IF_Prime_not {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int i ;
        System.out.println("Enter a number : ");
        i = sc.nextInt();

        if( i == 2 ){
            System.out.println("I is prime ");
        }else{
            boolean isPrime = true ;
            for ( int j = 2 ; j <=Math.sqrt(i); j++ ){
                if( i % j == 0 ){       // N is a multiple of I . 
                    isPrime = false ; 
                }
            }
            if (isPrime == true){
                System.out.println("I is prime ");
            }else{
                System.out.println("I is not prime ");
            }
        }
    }
}
