package Conditional;

import java.util.*;

//even hai ya odd hai bhai >>?
public class Eve_Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int Num ;
        System.out.println("Enter the number : ");
        Num = sc.nextInt();
        if (Num % 2 == 0  ){
            System.out.println("The number is even ");
        }
        else{
            System.out.println("The number is odd");
        }
    }    
}
