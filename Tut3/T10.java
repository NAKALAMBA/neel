package Tut3;

class OverloadDemo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double a)
    {
        System.out.println("the area of the circle is "+3.14 * a * a +" sq units");
    }
    void area(int a,int b)
    {
        int area = a * b / 2;
        System.out.println("the area of the triangle is "+ area +" sq units");
    }
}
public class T10 
{
     public static void main(String args[]) 
    {
       OverloadDemo ob = new OverloadDemo();
       ob.area(5);
       ob.area(11,12);
       ob.area(2.5);
       ob.area(5, 9);
    }
}
