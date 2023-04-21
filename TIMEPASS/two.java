import java.util.*;
public class two {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        String val1 , val2 ;
        System.out.println("Enter the first String : ");
        val1 = sc.next();
        System.out.println("Enter the Second String : ");
        val2 = sc.next();
        if(val1.equals(val2)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
