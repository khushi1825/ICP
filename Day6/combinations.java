package Day6;
import java.util.*;

public class combinations {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        ans=combine(n,k);
        
        System.out.println(ans);
    }
    public static List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        helper(ans,list,k,0,arr);
        return ans;
    }

    public static void helper(List<List<Integer>>ans,List<Integer>list,int k,int idx,int arr[]){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);
            helper(ans,list,k,i+1,arr);
            list.remove(list.size()-1);
        }
    }
}
