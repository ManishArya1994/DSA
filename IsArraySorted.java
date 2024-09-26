package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int n=arr.length;
        System.out.println(sorted(arr,n));
    }

     static boolean sorted(int[] arr, int n) {
        for(int i=1;i<n;i++)
        {
            if (arr[i]< arr[i-1]) 
            
            return false;
        }
        //for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n; j++){
        //         if(arr[i]>arr[j])
        //         return false;
        //     }
        // }
        return true;
    }
    
}
