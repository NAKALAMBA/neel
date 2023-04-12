package Coditional_statements;


import java.util.*;

//Calculator in java is the question .


public class Calculator {
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in );
        int a , b , value , opr ;
        System.out.print("Enter the value for A : ");
        a = sc.nextInt();
        System.out.print("Enter the value for B : ");
        b = sc.nextInt();
        System.out.print("Which operation do you want to perform : ");
        value = sc.nextInt();
        switch(value){
            case 1 :
            System.out.println("Addition of Both the number's : " );
            opr = a + b ;
            System.out.println(opr);
            break;
            case 2 :
            System.out.println("Subtract of Both the number's : " );
            opr = a - b ;
            System.out.println(opr);
            break;
            case 3 :
            System.out.println("Multiply of Both the number's : " );
            opr = a * b ;
            System.out.println(opr);
            break;
            case 4 :
            System.out.println("Divide of Both the number's : " );
            opr = a / b ;
            System.out.println(opr);
            break;
            case 5 :
            System.out.println("Modulus of Both the number's : " );
            opr = a % b ;
            System.out.println(opr);
            break;
            default :
            System.out.println("Yaha pe kuch bhi nahi hai bhad mai ja" );
            break;
        }
    }
}
