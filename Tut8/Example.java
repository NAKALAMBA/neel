package Tut8;

class Test<T, U> 
{ 
	T obj1; // An object of type T 
    T obj12;
	U obj2; // An object of type U 
	U obj22;
    // constructor 
	Test(T obj1 , U obj2 , T obj12 , U obj22) 
	{ 
		this.obj1 = obj1;
        this.obj12 = obj12; 
		this.obj2 = obj2;
        this.obj22 = obj22;
	} 
	// To print objects of T and U 
	public void print() 
	{ 
		System.out.println(obj1);
        System.out.println(obj12);
	    System.out.println(obj2);
        System.out.println(obj22);
	} 
} 

public class Example {
    public static void main (String[] args){ 
	   Test <String, Integer> obj = new Test("Class of MCA","Kya hua bhai >>? " , 10 , 15); 
		obj.print();
	}
}