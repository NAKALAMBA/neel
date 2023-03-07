package Tut3;

class nice {
    int width;
    int height;
    int length;
}
public class T4{
    public static void main(String agrs[])
    {
        nice objA = new nice();
        nice objB = new nice();
        objA.height = 1;
        objA.length = 2;
        objA.width = 1;
        objB = objA;
        System.out.println(objB.height);
    }
}
