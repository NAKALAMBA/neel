import java.util.*;
public class three {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        String Val , Val2  ;
        int op ;
        System.out.print("Enter the first String : ");
        Val = sc.next();
        System.out.print("Enter the Second String : ");
        Val2 = sc.next();
        System.out.print("Enter Your Choice : ");
        op = sc.nextInt();
        switch(op){
            case  1 :
            String Vallower = Val.toLowerCase();
            System.out.print(Vallower);
            break ;
            case  2 :
            System.out.print(Val.compareTo(Val2));
            break ;
            case 3 :
            String Val3 = Val.concat(Val2) ;
            System.out.println(Val3);
            break ;
            case 4 :
            System.out.println(Val.equalsIgnoreCase(Val2));
            break ;
            case 5 :
            int val4 , val5 ;
            System.out.print("Which Index No of the Word : ");
            val4 = sc.nextInt();
            char ch = Val.charAt(val4);
            System.out.println(ch);
            System.out.print("Which Index No of the Word : ");
            val5 = sc.nextInt();
            char ch2 = Val.charAt(val5);
            System.out.println(ch2);
            break ;
            case 6 :
            String VAL ;
            System.out.println("Hey there");
            VAL = String.valueOf(Val);
            System.out.println(VAL + " wassup ");
        }
    }
}
