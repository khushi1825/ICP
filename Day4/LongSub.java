package Day4;
import java.util.*;

public class LongSub {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next(); // abcabcbb
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {       
        int max=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> res=new ArrayList<>();
            for(int j=i;j<s.length();j++){
                if(!res.contains(s.charAt(j))){
                    res.add(s.charAt(j));
                    max=Math.max(max,res.size());
                }
                else{
                    break;
                }
            }

        }

        return max;
    }
}
