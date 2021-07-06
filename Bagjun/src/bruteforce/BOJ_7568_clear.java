/* 작성 : 21.07.05 
 * 
 * 
 * 
 * 어차피 다 돌면서 확인을 해야함 -> 브루트포스
 * 얼마나 돌아야함? -> 2<= N <= 50 -> 크기 안커서 브루트포스 가능 
 * 
 * 정렬하고 확인하면 빠르겠다. 
 * 마지막 출력은 각 학생들의 등수를 출력을 해야한다. 같은 속성이 여러개니 배열로 처리하자.
 *  
 * 핵심 : 키, 몸무게 둘 다 커야지 몸집이 큰거임.(같은 경우도 안됨)    
 * 
 * 원래 내 생각 
 * 1.모든 학생이 몇명보다 높은지 갯수를 일일히 다 센다 .
 * 2.이후에 등수를 센다. (근데 여기서 막힘..)
 *  
 * 몰랐던 아이디어
 * 1. 모든 학생들 순위를 모두 1로 초기화한뒤, 비교해서 작은 놈한테 순위를 ++해준다. 
 * 그러면, 한 번에 끝남. 
 *  
 * 
 */
package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_7568_clear {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Student[] students = new Student[n];
		
		
		for(int i=0 ; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			students[i] = new Student(weight,height);			
		}
		
//		Arrays.sort(students,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getWeight() - o1.getWeight();
//			}			
//		});//나 정렬 왜했니?ㅋㅋ 
		
		for(int i=0 ; i<n ;i++) {
			for(int j=0 ;j<n; j++){
				if( j==i || students[i].getWeight() == students[j].getWeight()) continue; 
				//***기준 i 가 j보다 크다고 판정이되면, j의 숫자를 올려줌.*** 이런 생각을 못했음..  				
				if(students[i].getWeight() > students[j].getWeight() && students[i].getHeight() > students[j].getHeight()) {
					int rank = students[j].getRank();
					students[j].setRank(rank+1);  
				}
			}			
		}
		
		for(Student st : students)
			bw.write(st.getRank()+" ");
		
		bw.flush();
		bw.close();
		br.close();
	

	}
	

}
class Student{
	private int weight;
	private int height;
	private int rank;
	public Student(int weight, int height) {
		this.weight = weight;
		this.height = height;	
		this.rank = 1;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getHeight() {
		return this.height;
	}
	public int getRank() {
		return this.rank;
	}
	public int setRank(int rank) {
		return this.rank = rank;
	}
	public int setHeight(int height) {
		return this.height = height;		//여기서는 필요없음 .
	}
	public int settWeight(int weight) {
		return this.weight = weight;		//여기서는 필요없음 .
	}
	
}
