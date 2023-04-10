package Operators;




/*
 *  Logical 2 operands
 *      && => A && B = 10 + 15 = 15.  <Logical And>
 *      || => A || B = 10 + 15 = 5. <Logical Or>
 *      ! => A !  B = 10 + 15 = 50. <Logical Not>
 *  For Logical Not:
 *    F => T
 *    T => F
 */

public class Logical {
    public static void main( String args[] ){
    System.out.println( ( 3 > 2 ) && ( 4 > 0 ) );
    System.out.println( ( 3 < 2 ) && ( 4 > 0 ) );
    System.out.println( ( 3 < 2 ) || ( 4 < 0 ) );
    System.out.println( ( 3 > 2 ) && ( 4 > 0 ) );
    System.out.println( !( 3 > 2 ) );
    System.out.println( !( 3 < 2 ) );
    }
}