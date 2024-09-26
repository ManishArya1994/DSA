package Arrays_DataStructure.Arrays_Programs.Easy_Arrays_Programs;

public class Find_the_number_that_appears_once {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,3,5,10,5,2,9,9};
        int n= arr.length;
        int ans=findOneOccrenceNum(arr,n);
        System.out.println(" Find_the_number_that_appears_once =" + ans);
    }

    private static int findOneOccrenceNum(int[] arr, int n) {

        int cnt=0;
        for(int i=0; i<n; i++){
            int num=arr[i];
            cnt=0;
            for(int j=0; j<n; j++){
                if(arr[j]== num)
                cnt++;
            }
            if(cnt ==1)
            return arr[i];

        }

        return -1;
       
    }
    
}
