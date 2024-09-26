package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;
import java.util.*;

public class findtheunion {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
       ArrayList<Integer> result= FindUnion(arr1,arr2,n,m);
       for(int it: result)
        System.out.println(it+" ");
    }
     static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> arraylist= new ArrayList<>();  
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        for( int union:set){
            arraylist.add(union);
        }

        return arraylist;

       
    }
    
}
