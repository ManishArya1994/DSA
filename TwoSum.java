package Arrays_DataStructure.Arrays_Programs.Medium_Arrays_programms;

public class TwoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

    private static String twoSum(int n, int[] arr, int target) {
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]== target)
                return "Yes";
            }
        }
        
        return "No";
    }
    
}
