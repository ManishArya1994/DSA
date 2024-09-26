package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;


public class roateleftarray {
    public static void main(String[] args) {
            int n=5;
        int arr[]= {1,2,3,4,5};
        solve( arr, n);   
    }

     static void solve(int[] arr, int n) {
        int temp[]= new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        for(int i=0;i<n;i++){
            System.out.println(temp[i] +" ");
        }

    }
    
    
}
