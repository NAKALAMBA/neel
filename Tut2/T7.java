package Tut2;

import java.util.*;
class T7{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int i;
        for(i=0; i<5; i++)
        {
            System.out.println("Enter a marks of subject " + i);
            marks[i] = sc.nextInt();
        }
        System.out.println("Your marks are: ");
        for(i=0; i<5; i++)
        {
            System.out.println(marks[i]);
        }
    }
}

