package dfs;

import java.io.*;
import java.util.*;

class BOJ_2667_again{
    static int[][] arr;
    static int[][] visit;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int V,count;
    
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        String st;
        arr = new int[V][V];
        visit = new int[V][V];
        
        for(int i=0 ;i<V;i++){
            st = sc.next();
            for(int j=0 ;j<V;j++){
                arr[i][j] = st.charAt(j)-'0';
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0 ;i<V; i++){
            for(int j=0 ;j<V; j++){
                if(arr[i][j]==1 && visit[i][j]==0) {
                    count=1; //첫 count는 해놓고 dfs들어가기 
                    dfs(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        
        System.out.println(result.size());
        
        for(int i=0;i<result.size();i++)
            System.out.println(result.get(i));
 
    }
    public static int dfs(int i, int j){
        visit[i][j] = 1;
        
        for(int k=0;k<4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            
            if(x >=0 && y >= 0 && x< V && y<V){
                if(arr[x][y]==1 && visit[x][y]==0){
                    
                    dfs(x,y);
                    count++;
                }
    
            }
        }
        return count;   
        
        
    }
}