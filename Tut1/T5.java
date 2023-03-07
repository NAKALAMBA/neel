package Tut1;
import java.util.Scanner;
class T5{
public static void main(String args[])
{
   float DBMS, Web_Dev, CG, Maths , DT; 
   double total, average, percentage;
    Scanner op=new Scanner(System.in);
    /* Input marks of all five subjects */
    System.out.println("Enter marks of five subjects ");
    System.out.println("-------------------------------------");
    System.out.print("Enter marks of DBMS subject : \t");
    DBMS=op.nextFloat();
    System.out.print("Enter marks of Web_Dev subject : \t");
    Web_Dev=op.nextFloat();
    System.out.print("Enter marks of CG subject : \t");
    CG=op.nextFloat();
    System.out.print("Enter marks of Maths subjects : \t");
    Maths=op.nextFloat();
    System.out.print("Enter marks of DT subject : \t");
    DT=op.nextFloat();

    /* Calculate total, average and percentage */
    total = DBMS + CG + DT + Maths + Web_Dev;
    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    /* Print all results */
    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);

   }
}