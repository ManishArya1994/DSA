package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,3,4};
        //int n= arr.length;
        int k=duplicate(arr);
        
        System.out.println("The array after removing duplicate elements is " );
        for(int i=0;i<k; i++){
            System.out.println(arr[i]);

        }  
    }
         static int duplicate(int[] arr) {
        HashSet<Integer> set= new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
       
       
       
    }
    
    
    
   
    
}
