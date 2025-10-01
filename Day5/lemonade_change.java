package Day5;

import java.util.Scanner;

public class lemonade_change {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt(); 
        }

        boolean ans=lemonadeChange(arr);
        System.out.println(ans);
    }



    public static boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;

        for (int x:bills){
            if(x==5){
                five++;
            } 
            else if(x==10){
                if (five>0){
                    five--;
                    ten++;
                } 
                else{
                    return false;
                }
            } 
            else {
                if (five>0 && ten>0){
                    five--;
                    ten--;
                } 
                else if(five>2){
                    five-=3;
                } 
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
