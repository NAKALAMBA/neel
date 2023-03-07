package Tut3;

import java.util.Scanner;

public class T5 {
        private String name;
        private int eng;
        private int hn;
        private int mts;
        private double total;
        private double avg;
    
        public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter marks in English: ");
        eng = in.nextInt();
        System.out.print("Enter marks in Hindi: ");
        hn = in.nextInt();
        System.out.print("Enter marks in Maths: ");
        mts = in.nextInt();
    }
    
    public void compute() {
        total = eng + hn + mts;
        avg = total / 3.0;
    }
    
    public void display() {
        System.out.println("---------------------------");
        System.out.println("Name: " + name);
        System.out.println("Marks in English: " + eng);
        System.out.println("Marks in Hindi: " + hn);
        System.out.println("Marks in Maths: " + mts);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
    
    public static void main(String args[]) {
        T5 obj = new T5();
        obj.accept();
        obj.compute();
        obj.display();
    }
}

