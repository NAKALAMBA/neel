package Tut8;

import java.util.Scanner;

class Generics<T>
{
    T data;
    Generics(T data)
    {
    this.data = data;
    }
    void print()
    {
    System.out.println("Data: "+this.data);
    System.out.println();
    }
}
public class Q1
{
        public static void main(String args[])
        {
        int num;
        String str;
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter integer: ");
                num=sc.nextInt();
                    Generics <Integer> intObj = new Generics<>(num);
                    intObj.print();
                    System.out.println("Enter string: ");
                    str = sc.next();
                    Generics <String> strObj = new Generics<>(str);
                    strObj.print();
            }
    }