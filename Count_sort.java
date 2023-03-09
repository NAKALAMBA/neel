package jAVA_M2.OOPS;

public class Count_sort {
    
    public static void Count_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest , arr[i]); 
        }

        int count [] = new int [ largest + 1 ];
        for(int i = 0 ; i < arr.length ; i++ ){
            count[arr[i]]++;
        }




        //Sorting
        int j = 0;
            for(int i = 0 ; i < count.length ; i++ ){
                while(count[i] > 0 ){
                    arr[j] = i ;
                    j++;
                    count[i]--;
                }
            }
    }



    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        
    }


    public static void main(String args[]){
    int arr[] = { 4 , 2 , 6 , 1 , 9 , 8 , 5 };
    Count_sort(arr);
    PrintArr(arr);
    }
}


