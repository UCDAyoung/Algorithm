package sort;

import java.util.Arrays;
import java.util.*;
import java.util.Comparator;

/* Arrays.sort(객체) 를 사용하려 이 객체는 comparable이 implements 되어있어야한다. 
 *  
 */
public class Comparabe과Quicksort {

	public static void main(String[] args) {
		//student의 id를 Arrays.sort를 이용해서 비교해서 정렬하기
		//여기 객체가 애초에 id를 비교하게 commparable이 되어있어서 자연스레 id 기준 정렬이 된 것.
		Student[] ex1 = new Student[5];
		ex1[0] = new Student(97,"준영");
		ex1[1] = new Student(96,"소래");
		ex1[2] = new Student(99,"현준");
		ex1[3] = new Student(20,"2학년");
		ex1[4] = new Student(21,"새내기");
	
		Arrays.sort(ex1,Collections.reverseOrder()); 
		for(Student s : ex1)
			System.out.println(s.id+":"+s.name);
		
		//퀵소트로 정렬해보기 
		
		
		
		
		
	}

	static void sort(Student[] a, int left, int right){
	     int pl = left;
	     int pr = right;
	     Student x = a[(pl+pr)/2];
	
	     do{
	         while(a[pl].compareTo(x) == -1) pl++;
	         while(compare(a[pr], x) == 1) pr--;
	         if(pl <= pr){
	             Student temp = a[ pl];
	             a[pl] = a[pr];
	             a[pr] = temp;
	             pl++;
	             pr--;
	         }
	     }while(pl <= pr);
	
	     if(left < pr) sort(a, left, pr);
	     if(right > pl) sort(a, pl, right);
	 }
	
	
	public static int compare(Student a, Student b) {
		   if(a.id > b.id)
		      return 1;
		   else if(a.id == b.id)
		      return a.name.compareTo(b.name);
		   else
		      return -1;
		
	}
}
	class Student implements Comparable<Student>{
		int id;
		String name;
		public Student(int id, String name){
			this.id = id;
			this.name = name;
		}
		@Override
		public int compareTo(Student o1) {
			if(this.id < o1.id)
				return 1;
			else if(this.id==o1.id)
				return this.name.compareTo(o1.name);
			else 
				return -1;
		}
		
	}
	//??어떻게 사용하는거

	class StudentComp implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
		   if(o1.id > o2.id)
		      return 1;
		   else if(o1.id == o2.id)
		      return o1.name.compareTo(o2.name);
		   else
		      return -1;
		}
	}
	
//	
//	class Student implements Comparable<Student>{
//			int id;
//			String name;
//		public Student(int id, String name) {
//		   this.id = id;
//		   this.name = name;
//		}
//		public int compareTo(Student b) {
//		   if(this.id > b.id)
//		      return 1;
//		   else if(this.id == b.id)
//		      return this.name.compareTo(b.name);
//		   else
//		      return -1;
//		}
//	}
