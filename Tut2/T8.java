package Tut2;

import java.util.*;

class T8{
public static void main(String args[])
{
    float arr[] = new float[10];
    Scanner sc=new Scanner(System.in);
    int i;
    float sum=0.0f;
    float avg=0.0f;
    for(i=0;i<=9;i++)
    {
    System.out.println("Marks of student: "+(i+1));
    arr[i]=sc.nextFloat();
    sum=sum+arr[i];
    }
    avg=sum/10;
    System.out.println("Average of the marks is: "+avg);
}
}
