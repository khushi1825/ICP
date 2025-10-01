package Day5;

import java.util.*;
public class non_overlapping_intervals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] []arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt(); 
            arr[i][1]=sc.nextInt(); 
        }

        int ans=eraseOverlapIntervals(arr);
        System.out.println(ans);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[1],b[1]));
        int n=intervals.length;
        int count=1;
        int end=intervals[0][1];

        for (int i=1;i<n;i++){
            if (intervals[i][0]>=end){
                count++;
                end=intervals[i][1];
            }
        }
        return n-count;
    }
}
