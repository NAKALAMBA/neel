

/* 
package Tut4;

abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
    dim1 = a;
    dim2 = b;
    }
    abstract double area(); // area is now an abstract method
   }
   class Rectangle extends Figure {
    Rectangle(double a, double b) {
    super(a, b);
    }
    // override area for rectangle
    double area() {
    System.out.println("Inside Area for Rectangle.");
    return dim1 * dim2;
    }
   }
   class Triangle extends Figure {
    Triangle(double a, double b) {
    super(a, b);
    }
    // override area for right triangle
    double area() {
    System.out.println("Inside Area for Triangle.");
    return dim1 * dim2 / 2;
    }
   }

public class Q3 {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);_
       
        Figure figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        
        figref = t;
        System.out.println("Area is " + figref.area());
        }
}

*/
