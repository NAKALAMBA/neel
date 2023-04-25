package Generics;

import java.util.ArrayList;
import java.util.*;



public class Learn {
    public static void main( String args[] ){
        ArrayList<Integer> arrayList =new ArrayList();
        /* 
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        */
        arrayList.add(53);
        arrayList.add(4234);
        int a = arrayList.get(0);
        System.out.println(a);
    }
}
