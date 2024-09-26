package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroLast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        //for accending order data use beloe line of code
        //Arrays.sort(ans);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    private static int[] moveZeros(int n, int[] arr) {

ArrayList<Integer> temp= new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
    for(int i=0;i<n;i++){
    if(arr[i] !=0)
        temp.add(arr[i]);
        }
         // number of non-zero elements.
        int nz = temp.size();
         //copy elements from temp
        //fill first nz fields of
        //original array:
        for(int i=0;i<nz;i++){
            arr[i]= temp.get(i);

        }//fill rest of the cells with 0:
        for(int i=nz; i<n;i++){
            arr[i]=0;
        }

        return arr;
        
    }
    
}
