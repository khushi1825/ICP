package Day4;

import java.util.*;

public class Longest_repeating {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int ans=characterReplacement(s,k);        
        System.out.println(ans);
    }


    public static int characterReplacement(String s, int k) {
        int left=0;
        int n=s.length();
        int maxLen=0;
        int maxCount=0;
        int[] freq=new int[26];
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'A']++;
            maxCount=Math.max(maxCount,freq[s.charAt(right)-'A']);
            if(right-left+1-maxCount>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
