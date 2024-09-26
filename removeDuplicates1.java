package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

import java.util.Arrays;

public class removeDuplicates1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,1,3,5};
        int k=remove(arr);
        System.out.println("removing duplicate Element from Arrays");
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }
    }

    private static int remove(int[] arr) {
       // Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if( arr[i] !=arr[j]){
                i++;
                arr[i]=arr[j];
            }
           
           
        }
        return i+1;
    }
    
}
