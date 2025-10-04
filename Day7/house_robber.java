package Day7;
import java.util.*;

public class house_robber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }

        
        int ans=rob(arr);
        System.out.println(ans);

    }
       
    public static int rob(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        res[0]=nums[0];
        res[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            res[i]=Math.max(res[i-2]+nums[i],res[i-1]);
        } 

        return res[n-1];
    }

}
