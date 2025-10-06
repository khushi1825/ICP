package Day8;

import java.util.*;
public class online_stack_span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StockSpanner ss=new StockSpanner();

        int m=sc.nextInt(); 
        int[] price=new int[m];

        for (int i=0;i<m;i++){
            price[i]=sc.nextInt();
        }

        for (int i=0;i<m;i++){
            System.out.println(ss.next(price[i]));
        }

    }
}

class StockSpanner {
    static Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public static int next(int price){
        int count=1;
        while (!st.isEmpty() && st.peek()[0] <= price){
            count += st.pop()[1];
        }
        st.push(new int[]{price, count});
        return count;
    }
}
