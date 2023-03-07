

//Area of a circle 


package Basics;

import java.util.Scanner;

public class Aoac {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float rad = sc.nextFloat();
        float area  = 3.14f * rad * rad ;
        System.out.println(area);
    }    
}
