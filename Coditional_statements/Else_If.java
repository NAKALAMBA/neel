package Coditional_statements;




import java.util.*;

//Over here you need to understand about Else If in java.


public class Else_If {
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in );
        int age ;
        System.out.print("Enter the age of the user : ");
        age = sc.nextInt();
        if(age >= 18 ){
            System.out.println("You can drive a car");
        }else if( age >= 16 && age < 18 ){
            System.out.println("You can drive a Scooty");
        }else{
            System.out.println("You can dirve a cycle");
        }
    }
}
