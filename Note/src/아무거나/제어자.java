/*  public > protected > (default) > private 
 * 
 * 붙일 수 있는 경우가 
 * 멤버변수,메소드 : 제어자 모두 붙일 수 있는 반면에  
 * 클래스에는 : Public & (default)안붙이거나 이 2가지 경우 뿐 
 * 
 * public  : 접근제한없음 . 
 * protected : 같은 패.키.지 내에서 && 다른 패키지 자손클래스에서 접근 가능   
 * (default) : 같은 패키지 내에서 
 * privtate : 같은 클.래.스 내에
 * 
 * 
 */
package 아무거나;

class Itis_default{
	private 	int x;
				int y;
	protected	int z;
	public 		int k;
}

public class 제어자 {
	public static void main(String[] args) {
		Itis_default p = new Itis_default();
		
		//System.out.print(p.x);   private이라 접근 불
		System.out.print(p.y);
		System.out.print(p.z);
		System.out.print(p.k);
		

	}

}
