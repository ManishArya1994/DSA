package Arrays_DataStructure.Arrays_Programs.Medium_Arrays_programms;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");
    }

    private static int[] twoSum(int n, int[] arr, int target) {

        int[] ans= new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            int moreneeded=target-num;
            if(map.containsKey(moreneeded)){
                ans[0] = map.get(moreneeded);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);
           
        }
        return ans;
        
    }
    
}
