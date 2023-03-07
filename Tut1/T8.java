package Tut1;
public class T8
    {
      public static void main (String[]args)
      {
        int number = 20;
   
        //Checking if the number is divisible by 2
        String status = number % 2 == 0 ? " is Even" : " is Odd";
          System.out.println (number + status);
      }
}