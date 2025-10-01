package Day5;

import java.util.*;

public class queue_reconstruction_by_height {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] []arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt(); 
            arr[i][1]=sc.nextInt(); 
        }

        int[][] ans=reconstructQueue(arr);
        for(int[] person:ans){
            System.out.println(person[0]+" "+person[1]);
        }
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(o1,o2)->((o1[0]==o2[0])?(o1[1]-o2[1]):(o2[0]-o1[0])));
        List<int[]> arr=new ArrayList<int[]>();
        for(int p[]:people){ 
            arr.add(p[1],p);
        }
        return arr.toArray(new int[people.length][2]);
    }
}
