package Codes.Strings;

import java.util.*;

public class Strings1 {

    public static void PrintLetters(String str){
        for(int i = 0 ; i < str.length() ; i++ ){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // char arr[]= { 'a' , 'b' , 'c' , 'd' };
        // String str = "abcd";
        // String str2 = new String ("XYZ");

        // //Strings are IMMUTABLE 

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        String fullName = "Tony stark";
        System.out.println(fullName.length());


        //Conacatenation 
        String FirstName = "Neel";
        String LastName = "Lohith";
        String FullName = FirstName + " " + LastName ;
            System.out.println(FullName + " full name is this" );
            System.out.println(FullName.charAt(3));

            System.out.println();

            PrintLetters(FullName);
    }
}
