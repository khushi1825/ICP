package Day8;

import java.util.*;
public class reverse_polish_notation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String tokens[]=new String[n];
        for(int i=0;i<n;i++){
            tokens[i]=sc.next();
        }
        int ans=evalRPN(tokens);
        System.out.println(ans);

    }

    public static int evalRPN(String[] tokens) {
        int a,b;
		Stack<Integer> S=new Stack<Integer>();
		for (String s:tokens){
        	if(s.equals("+")){
			    S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")){
				b=S.pop();
				a=S.pop();
				S.add(a/b);
			}
			else if(s.equals("*")){
				S.add(S.pop()*S.pop());
			}
			else if(s.equals("-")){
				b=S.pop();
				a=S.pop();
				S.add(a - b);
			}
			else {
				S.add(Integer.parseInt(s));
			}
		}	
		return S.pop();
	}
}
