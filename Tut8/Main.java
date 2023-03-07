package Tut8;

import java.util.*;
class Generics<T>
{
    T x;
    T y;
       
    public static <T extends Number> void add(T x, T y) 
    {
    System.out.println("\nAddition: "+(x.intValue() + y.intValue()));
    }

    public static <T extends Number> void sub(T x, T y) 
    {
    System.out.println("\nSubtraction: "+(x.intValue() - y.intValue()));
    }

    
    public static <T extends Number> void adddou(T x, T y) 
    {
    System.out.println("\nAddition: "+(x.doubleValue() + y.doubleValue()));
    }

    public static <T extends Number> void subdou(T x, T y) 
    {
    System.out.println("\nSubtraction: "+(x.doubleValue() - y.doubleValue()));
    }

    public static <T extends String> void addstr(T x, T y) 
    {
        String str1,str2;
        str1 = x.toString();
        str2 = y.toString();
    System.out.println("\nAddition of strings: "+(str1+str2));
    }

    public static <T extends String> void substr(T x, T y) 
    {
        String str1,str2;
        str1 = x.toString();
        str2 = y.toString();
    System.out.println("\nSubtraction of two strings: "+(str1.contains(str2)));
    }
}

public class Main
{
    public static void main(String args[])
    {
        int num1,num2;
        double n1,n2;
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("What type of object do you want?\n1)Integer\n2)String\n3)Double\n");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("\nEnter two integers: ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                Generics <Integer> intObj = new Generics<>();
                System.out.println("\nWhat would you like to do?\n1)Addition\n2)Subtraction\n");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                        intObj.add(num1,num2);
                        break;
                    }
                    case 2:
                    {
                        intObj.sub(num1,num2);
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong input.");
                    }
                }
                break;
            }

            case 2:
            {
                System.out.println("\nEnter two strings: ");
                sc.nextLine();
                str1=sc.nextLine();
                str2=sc.nextLine();
                Generics <String> strObj = new Generics<>();
                System.out.println("\nWhat would you like to do?\n1)Addition\n2)Subtraction");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                        strObj.addstr(str1,str2);
                        break;
                    }
                    case 2:
                    {
                        strObj.substr(str1,str2);
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong input.");
                    }
                }

                break;
            }

            case 3:
            {
                System.out.println("\nEnter two decimal numbers: ");
                n1=sc.nextDouble();
                n2=sc.nextDouble();
                Generics <Double> douObj = new Generics<>();
                System.out.println("\nWhat would you like to do?\n1)Addition\n2)Subtraction");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                        douObj.adddou(n1,n2);
                        break;
                    }
                    case 2:
                    {
                        douObj.subdou(n1,n2);
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong input.");
                    }
                }

                break;
            }

            default:
            {
                System.out.println("Wrong input.");
            }
        }
    }
}