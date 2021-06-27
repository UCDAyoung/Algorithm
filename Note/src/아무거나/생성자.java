package 아무거나;

public class 생성자 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,3,5);
		System.out.println(p.x);
	}
}

class Point {
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
		
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x,int y, int z){
		super(x,y);     //<---------------------모든 생성자는 첫 줄에 다른 생성자를 호출해야한다.  여기서 다른 생성자란, 조상의 생성
		this.z = z;
	}

}
