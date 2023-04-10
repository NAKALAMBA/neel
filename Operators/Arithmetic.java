package Operators;




/*
 * Binary 2 operands
 *      + => A + B = 10 + 15 = 15.
 *      - => A - B = 10 + 15 = 5.
 *      * => A * B = 10 + 15 = 50.
 *      / => A / B = 10 + 15 = 02.
 *      % => A % B = 10 + 15 = 00.
 */


public class Arithmetic {
    public static void main ( String args[]){
    int A=10,B=5;
    System.out.println("Addition : " + (A+B));
    System.out.println("Subtraction : " + (A-B));
    System.out.println("Multiplication : " + (A*B));
    System.out.println("Division : " + (A/B));
    System.out.println("Modulus : " + (A%B));
    }
}
