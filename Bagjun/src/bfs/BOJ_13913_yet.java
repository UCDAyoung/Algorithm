package bfs;
import java.util.*;
public class BOJ_13913_yet {
	static int MAX = 100_000;
    static int[] dist = new int[MAX+1]; //distance 및 방문확인 기능 : 0이면 not visited/ 0이 아니면 already visited  
    static Stack<Integer> s = new Stack<>();
    static Queue<Integer> q = new LinkedList<>();
    static int[] V = new int[MAX+1] ;
    static int start,end;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        
//        Arrays.fill(dist,-1); //-1로 초기화 
        
        bfs(start);
        
        System.out.println(dist[end]);
        for(int i=0 ;i <dist[end];i++)
        	System.out.print(s.pop()+" ");
    }
    public static void bfs(int v){
    	int cur = v;
        q.offer(v);
        s.push(v); 
        dist[v]=1;

        
        while(!q.isEmpty() && cur!=end){
            cur = q.poll(); // 저장
            
            int[] step = new int[3]; //코드 깔끔하게 하기 위해서 step배열을 만들어서 저장 
            step[0] = cur-1;
            step[1] = cur+1;
            step[2] = cur*2;            
            for(int i=0 ;i<3; i++ ) { //왜 3번만 돌리는지는 아직 이해가 잘 안됨.            	
            		if(step[i]>=0 && step[i]<=MAX) { // step 계산 후 범위 오버한지 확인  
            			if(dist[step[i]]==0) { //방문했는지 확인 
            				q.offer(step[i]);
            				s.push(step[i]);            			
            				dist[step[i]] = dist[cur]+1;            		
            			
            				
            			}
            		}
            }
         
            
            
        }
        return;
    }
}