package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;
import java.util.*;

public class Largestele {
    public static void main(String[] args) {
        int arr1[]={12,67,89,65,90,443};
        System.out.println("Largest Element is ="+ findelement(arr1));
        
    }

      static int findelement(int arr []) {
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max-1;
    }
    
}
