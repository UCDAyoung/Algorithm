/* 작성 : 21. 06. 15
 * 수정 : 
 * 확인 : 
 * 답 정확히 못냄.. 
 * 
 */
package bfs;

import java.util.*;
import java.io.*;

class BOJ_2178_yet{
    static int N,M;
    static int graph[][];
    static int dist[][];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        graph = new int[N][M];
        dist = new int[N][M];
        
        for(int i=0; i<N; i++){
            String input = sc.next();
            for(int j=0; j<M;j++){
                graph[i][j] = input.charAt(j)-'0';
                dist[i][j] = -1; // not visit 상태 
            }
        }//여기까지 입력
        
        bfs(0,0);
       
        System.out.println(dist[N-1][M-1]);
    
    }
    public static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        int nx,ny;
        q.offer(new Point(x,y));
        dist[0][0] +=1;
        
        while(q.isEmpty()!=true){
            Point p = q.poll();//왜 꺼내는지?? 밑에서 사용?
            for(int i=0 ;i<4;i++){
                nx = p.x + dx[i];
                ny = p.y+ dy[i];

                if(nx>=0 && ny>=0 && nx < N && nx < M){
                    if(graph[nx][ny]==1 && dist[nx][ny]==-1){
                        q.offer(new Point(nx,ny));
                        dist[nx][ny] = dist[x][y]+1;
                    }
                }

            }
        }
    }   
        
  
}
class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = y;
        this.y = y;
    }
}
