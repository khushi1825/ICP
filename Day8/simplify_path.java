package Day8;

import java.util.*;
public class simplify_path {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String ans=simplifyPath(n);
        System.out.println(ans);

    }


    public static String simplifyPath(String s) {
        Stack<String> stack=new Stack<>();
        String[] components=s.split("/");
        
        for(String component:components){
            if(component.equals(".") || component.isEmpty()){
                continue;
            } else if(component.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else{
                stack.push(component);
            }
        }
        
        if (stack.isEmpty()){
            return "/";
        }
        
        StringBuilder ans=new StringBuilder();
        for (String dir:stack){
            ans.append("/").append(dir);
        }
        
        return ans.toString();
    } 
}
