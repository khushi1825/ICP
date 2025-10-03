package Day6;
import java.util.*;

public class word_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char [] []grid=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.next().charAt(0);
            }       
        }

        String word=sc.next();

        boolean ans=exist(grid,word);
        System.out.println(ans);
    }

    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(clear(board,i,j,word,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean clear(char [][] grid,int r,int c,String word,int idx){
        if(idx==word.length()){
            return true;
        }

        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]!=word.charAt(idx)){
            return false;
        } 

        char ch=grid[r][c];
        grid[r][c]='0';
        int [][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int [] a:dir){
            if(clear(grid,r+a[0],c+a[1],word,idx+1)){
                grid[r][c]=ch;
                return true;
            }
        }
        grid[r][c]=ch;
        return false;
    }
}
