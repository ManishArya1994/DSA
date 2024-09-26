package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs; 

public class Searching {
    
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,62,344,56};
    int key=4;
    int n=arr.length;
    int result=search(arr,key,n);
    if(result== -1)
    System.out.println("element is not present in the array");
    else
    System.out.println("element is present at the Index of"+result);
    
    
   }

private static int search(int[] arr, int key, int n) {
    for(int i=0;i<n;i++){
        if(arr[i]== key)
        return i;
    }
    return -1;
}
}
