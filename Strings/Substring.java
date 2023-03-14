package Codes.Strings;

public class Substring {
    public static String subString(String str , int si , int ei){ // Starting index and ending index in a string 
        String substr = "";
        for( int i = si ; i < ei ; i++ ){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "Neel lohith";
        System.out.println(subString(str, 0, 2));
    }
}
