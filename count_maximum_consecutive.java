package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class count_maximum_consecutive {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,0,0,1,1};
        int n=arr.length;
        int ans=checkConsecutive(arr,n);
        System.out.println("Maximum count_maximum_consecutive = "+ ans);
    }

    private static int checkConsecutive(int[] arr, int n) {
        int cnt=0;
        int maxi=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1)
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            }
            maxi=Math.max(maxi, cnt);
       
      

       return maxi;
    }
    
}
