package Operators;



/*


    Unary has only 2 operations Which are :
    ++ ( Increment )
    -- ( Decrament )


    In this we even have more 2 types such as :
    Pre Increment    &    Post Increment
    1. Value change  &     Value Use
    2. Value Use     &     Value Change


        Pre Decrement    &    Post Decrement
        1. Value change  &     Value Use
        2. Value Use     &     Value Change


    Such as :
        A => A + 1 => ( A++ OR ++A )
        A => A - 1 => ( A-- OR --A )

 */






public class Unary {
    public static void main(String args[]){
        /* 
        int a = 10 , b = ++ a ;
        System.out.println(a);
        System.out.println(b);
    */

        /* 
    int a = 10 , b = a ++ ;
    System.out.println(a);
    System.out.println(b);
    */

        /* 
    int a = 10 , b = -- a ;
    System.out.println(a);
    System.out.println(b);
    */



    int a = 10 , b = a -- ;
    System.out.println(a);
    System.out.println(b);
    }
}
