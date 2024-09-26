package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class missingNum_Array {
    
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int N=5;
      int ans=  missingnumber(arr,N);
      System.out.println("missing number is="+ ans);

    }

     static int missingnumber(int[] arr, int N) {

        for(int i=1;i<=N; i++){
            int flag=0;
            for(int j=0;j<N-1;j++){
                if(i==arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            return i;
        }
       

        return -1;
      
    }
    
}
