package Coditional_statements;


import java.util.*;

//This is a income tax Calculator in java


public class ITC {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in);
        int paisa , tax ;
        System.out.print("Kitna paise hai bhai tere pass 'huh' : ");
        paisa = sc.nextInt();
        
        System.out.println("Abhi rukh tera kaat ta hu mai " + " PAISA HAHAHAHAHA");
        
        if ( paisa < 5000 ){
            System.out.println("Tu toh bacha nikla re ");
            tax = paisa * 0 ;
            System.out.println("Tera paisa dekh kitna banaya hai tune : " + tax );
        
        }else if(paisa >= 5000 && paisa < 10000){
            System.out.println("Tera thoda sa toh katunga mai lessgo ");
            tax = ( int ) (paisa * 0.2);
            System.out.println("Pati gayu : " + tax );
            
        }else{
            System.out.println("Tu toh mara bhai tera hisab karke dekh kitna ayya abhi tereko ");
            tax = ( int ) (paisa * 0.3);
            System.out.println("dekh dekh : " + tax );
        }
    }
}