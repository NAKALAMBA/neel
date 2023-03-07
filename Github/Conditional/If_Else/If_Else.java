package Conditional.If_Else;

import java.util.*;

public class If_Else {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.println("Enter the user's age : " );
        age=sc.nextInt();
        if(age >= 18 ){
            System.out.println("ADULT : DRIVE , VOTE ");
        }
        else if(age > 13 && age < 18  ){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not an Adult");
        }
    }
}
