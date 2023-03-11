package Codes.Strings;

//Check If A string is palindrome or not (Company INDUET);

import java.util.*;


public class String2 {

    public static boolean is_Palindrome (String str){
        for(int i = 0 ; i < str.length()/2 ; i++ ){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //Not a palindrome
                return false ;
            }
        }
        return true;
    } 

    public static void main(String args[]){
        String str = "racecar";
        System.out.println(is_Palindrome(str));
    }
}
