package Day7;

import java.util.*;

public class maximum_subarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }

        
        int ans=maxSubArray(arr);
        System.out.println(ans);

    }

    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
            
        }

        return ans;
    }
}
