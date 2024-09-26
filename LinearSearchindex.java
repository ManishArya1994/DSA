package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class LinearSearchindex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=4;
        int n= arr.length;
       int result= search(arr,n,key);
       System.out.println(result);


    }

     static int search(int[] arr, int n, int key) {
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }

        }

        return -1;
       
        
    }
    
}
