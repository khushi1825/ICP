package Day5;
import java.util.*;
public class min_arrows {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] []arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int ans=findMinArrowShots(arr);
        System.out.println(ans);
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int prev=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=prev){
                continue;
            }
            else{
                count++;
                prev=points[i][1];
            }
        }
        return count;
    }
}
