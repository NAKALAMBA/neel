package Tut2;

import java.util.*;

class T5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        float i , sum=0 , sum1=0;
        System.out.println("No of times you want to add :");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            sum = sum + (1/i);
        }
        System.out.println("Sum = " + sum);

        for(i=1;i<=n;i++)
        {
            sum1 = sum1 + (i * i);
        }
        System.out.println("Sum = "+ sum1);


    }
}

