package Generics;


import java.util.*;

        class DemoClass{
            public <T> void genericsMethod(T data) {                   // create a generics method
            System.out.println("Data Passed: " + data);
        }
        public static void main (String args[] ) {
        DemoClass demo = new DemoClass();
        demo.<String>genericsMethod("Java Programming");    // generics method working with String
        demo.genericsMethod(25);       // generics method working with integer without including the type parameter
    }
}