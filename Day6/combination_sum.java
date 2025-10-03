package Day6;
import java.util.*;

public class combination_sum {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }

        int target=sc.nextInt();
        List<List<Integer>> ans=combinationSum2(arr,target);
        System.out.println(ans);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }

   static  void backtrack(int[] arr,int idx,int remain,List<Integer> path,List<List<Integer>> ans){
        if (remain == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (remain<0 || idx==arr.length) 
            return;
        path.add(arr[idx]);
        backtrack(arr,idx+1,remain-arr[idx],path,ans);
        path.remove(path.size()-1);
        int next=idx+1;
        while(next<arr.length && arr[next]==arr[idx]) 
            next++;
        backtrack(arr,next,remain,path,ans);
    }
}
