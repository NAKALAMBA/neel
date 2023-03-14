package Codes.Strings;




//It's a question to find the shortest way in ( north , south , west , east directions )....

//Bottom below there are even some examples for the string Comparing with basics and advanced module type's..>






public class Que_Shortest_path {
    public static float getShortestPath(String path){
        int x = 0 , y = 0 ;
        for(int i = 0 ; i < path.length() ; i++ ){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //North
            else if( dir == 'N'){
                y++;
            }
            //West
            else if( dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x ;
        int Y2 = y*y ;
        return (float) Math.sqrt(X2 + Y2);
        
    }


    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path)); 
        String s1 = "neel";
        String s2 = "Lohith";
        String s3 = new String ("neel");
        String s4 = new String ("Lohith");
        // if (s1 == s2 ){
        //     System.out.println("Strings are equal ");
        // }else{
        //     System.out.println("The strings are not equal ");
        // }
        // if(s1 == s3 ){
        //     System.out.println("The strings are equal ");
        // }else{
        //     System.out.println("The given strings are not equal ");
        // }

            if(s1.equals(s3)){
                System.out.println("the given strings are equal ");
            }else{
                System.out.println("the given strings are not equal ");
            }
            if(s2.equals(s4)){
                System.out.println("the given strings are equal ");
            }else{
                System.out.println("the given strings are not equal ");
            }
    }
}
