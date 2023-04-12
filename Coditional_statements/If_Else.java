package Coditional_statements;

import java.util.*;

public class If_Else {
    public static void main ( String args[] ){
    Scanner sc = new Scanner ( System.in );
    int age;
    System.out.print("Enter the age of the user : ");
    age = sc.nextInt();
    if ( age >= 18 ){
        System.out.println("You can vote ");
    }if( age > 13 || age <18 ){
        System.out.println("Just a few more year's kiddo then you can vote");
    }else{
        System.out.println("You cannot vote kid grow up");
        }
    }
}