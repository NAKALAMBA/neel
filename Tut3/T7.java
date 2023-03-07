package Tut3;

class A {
    int i ;
    int j ;
    A (){
        i = 1 ;
        j = 2 ;
    }
}
public class T7{
    public static void main(String args[]){
        A obj1 = new A();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
    }
}
