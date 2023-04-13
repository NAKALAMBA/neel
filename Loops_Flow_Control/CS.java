package Loops_Flow_Control;


import java.util.Scanner;


//Continue statement is the topic now.


public class CS {
    public static void main ( String args[] ){
        for( int i = 1 ; i <= 5 ; i++ ){
            if( i == 3 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
