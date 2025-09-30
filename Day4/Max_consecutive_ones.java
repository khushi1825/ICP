package Day4;

import java.util.*;

public class Max_consecutive_ones {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=longestOnes(arr,k);        
        System.out.println(ans);
    }

    public static int longestOnes(int[] nums, int k) {
        int left=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }

            if (k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
        }

        return nums.length-left;        
    }
}
