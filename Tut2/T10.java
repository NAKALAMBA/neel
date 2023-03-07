package Tut2;

import java.util.Scanner;

class T10 {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int i = 1, n = 5 , k;
          System.out.println("Enter the how many time's does <hello> should appear ? :  ");
          k = sc.nextInt();
          // do...while loop from 1 to 5
          do {
            System.out.println("hello");
            i++;
          } while(i <= n);
    }
}