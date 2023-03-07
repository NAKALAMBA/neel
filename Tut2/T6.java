package Tut2;

import java.util.*;

class T6{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double Gross, Tax, NetPay;

        System.out.println("Enter The Gross Salary:");
        Gross = sc.nextDouble();

        if(Gross <= 5000)
        {
            Tax = 0.0;
        }
        else if(Gross>5000 && Gross <=10000)
        {
            Tax = 0.1 * Gross;
        }
        else if(Gross>10000 && Gross<=20000)
        {
            Tax = 0.2 * Gross;
        }
        else 
        {
            Tax = 0.3 * Gross;
        }
        NetPay = Gross - Tax ;

        System.out.println("Gross Salary :" +Gross);
        System.out.println("Income Tax :" +Tax);
        System.out.println("Net Pay :" +NetPay);

    }
}
