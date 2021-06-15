/* 작성 : 21.06.15 
 * 수정 :
 * 확인 : 
 * 
 * **엄청 고생함,틀린이유 **
 * Point노드를 이용하길래 Point클래스를 생성해서 사용하려고 했는데 사용한적 없는 point가 자꾸 already declaration되었다알려주었다.
 * 알고보니까 java.awt.Point라는 라이브러리가 이미 import되어있었다. 
 * 1. import Point ?? 임시 노드인가??
 * 2. class 선언을 내부에 하려고 했는데, 이너클래스와 외부클래스의 차이가 뭐지??
 * 3. static으로 이미 선언한 V를  다시 한 번더 int V를 생성해 초기화해버렸다...이걸 못보고 지나쳐서 ...족히 3시간을..
 * 
 * **알게된 것 
 * java.awt.Point 는 2차원 좌표평면상 위의 (x,y) 좌표라고 생각하면 된다.
 * java.lang.Object > java.awt.geom.Point2D >  java.awd.Point
 * 
 *
 */
package bfs;

import java.awt.Point;
import java.util.*;


public class BOJ_2667_clear {
	static Queue<Point> q = new LinkedList();
	static int V,count;
	static boolean[][] visit;
	static int[][] arr;
	static ArrayList<Integer> result;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		
		visit= new boolean[V][V];
		arr = new int[V][V];

		for(int i=0; i<V ; i++) {
			String st = sc.next();
			for(int j=0; j<V; j++) {
				arr[i][j] = st.charAt(j)-'0';
				
			}
		}
		
		result = new ArrayList<>();
		for(int i=0 ;i<V; i++) {
			for(int j=0 ;j<V;j++) {
				if(arr[i][j]==1 && visit[i][j]==false) {  // 1이고 방문한 적이 없다면 방문합니다. 
					count =1; //카운트 1로 초기화합니다. 1부터 시작하려고 하는 것도 있고, 다른 단지에서는 다시 1부터 시작해야하기 때문입니다.
					bfs(i,j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);
		System.out.println(result.size());
		for(int i=0; i<result.size();i++)
			System.out.println(result.get(i));
		
		}
	
	public static void bfs(int x,int y) {
		int nx,ny;
		q.offer(new Point(x,y));//큐에 넣는다. 
		visit[x][y] = true;//방문표시 
		//방문표시는 처음에 들어올 때 했기 때문에 하지 않습니다.
		
		while(q.isEmpty()!=true) {
			Point point; //먼저 큐에서 꺼내서 담을 Point객체를 생성합니다. 
			point = q.poll(); // 큐에서 꺼냅니다. 
			//큐에서 꺼낸 정보를 이용해서 조건에 맞게 주변 정보를 가져옵니다. 
			for(int i=0; i<4;i++) {
				nx = point.x+ dx[i]; 
				ny = point.y+ dy[i];  //이 부분은 상하좌우를 확인하기 위한 인덱스를 설정하는 부분이라고 할 수 있습니다. 
			 
				if(nx>=0 && ny>=0 && nx <V && ny <V) { // 상화좌우 부분이 정점을 넘어가지 않도록 경계를 제한합니다. 
						if(arr[nx][ny]==1 && visit[nx][ny]==false) { //상하좌우 부분 중 1인 동시에,방문하지 않는 곳을 들릅니다. 
							q.offer(new Point(nx,ny));  //들렸다면 큐에 넣습니다. 
							visit[nx][ny]=true;  		// 방문 표시를 합니다. 
							count++;					//count를 셉니다. 
							bfs(nx,ny);					//동일하게 다시 주변을 찾습니다. 
						}					
				}
			}				
		
		}
	}
}
