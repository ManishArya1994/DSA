package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int arr1 []={12,56,2,89,10,77,1009};
        System.out.println("Largest Element Is= "+ sort(arr1));

        
    }

     static int sort(int[] arr2) {
        Arrays.sort(arr2);
        return arr2[arr2.length-1];
    }
    
}
