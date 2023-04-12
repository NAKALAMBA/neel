package Coditional_statements;



import java.util.*;

//Switch case Stataement is the question .



public class SS {
    public static void main ( String args [] ){
        Scanner sc = new Scanner ( System.in );
        int value ;
        System.out.println("Enter the value to be pushed mate : ");
        value = sc.nextInt();
        switch(value){
            case 0:
            System.out.println("Inad Da tension samosa tun ");
            break ;
            case 1:
            System.out.println("inad Da tension Burger tun ");
            break ;
            case 2:
            System.out.println("inad Da tension Mango Shake kudi Da");
            break ;
            default:
            System.out.println("We GO gym YEAAAHHHHHHH");
            }
    }
}
