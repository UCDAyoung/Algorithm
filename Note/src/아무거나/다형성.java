package 아무거나;
/*
 * 
 * 
 * 1. 다형성 
 *  	1.1 List list = new ArrayList(); 조상 타입 참조변수로 자손타입의 인스턴스를 가르킬 수 있음
 *  	1.2 참조변수의 형변환 
 *  	1.3 instanceof 
 *  	1.4 다형성의 장점 
 *  		1.4.1  	조상 타입으로 여러 자손타입을 가르킬 수 있다는 점 (다형적 매개변수) 
 *  	 	1.4.1	하나의 배열에 여러가지 객체를 저장 할 수 있다.  
 *  	 
 * 
 * 1.2 
 * 참고 : https://www.youtube.com/watch?v=3lSPC37IaNQ&list=PLW2UjW795-f5JPTsYHGAawAck9cQRw5TD&index=32
 * 참조변수의 형변환 == 리모콘으로 생각하면 편해! ,연결했다 안했다. 
 * 1.형변환은 조상 <-> 자손 관계에서 자유자재로  
 * 2.형변환을 통해 멤버의 갯수(메소드, 멤버변수 등)를 조절하며 제한 할 수 있음. 
 * #핵심#  참조한 변수의 실제 가르키고 있는 인스턴스(객체)를 확인하고 , 사용할 수 있는 멤버변수를 넘어서면 에러가 난다.
 * 
 * 
 * 
 * 1.3 
 * a instanceof b로 형변환이 가능한지 먼저 확인하기 / 리턴 : true or false  
 *   a참조변수가 b타입으로 변환이 가능하진지
 *   
 * 1.4.1 
 *
 *
 */
public class 다형성 { 
	public static void main(String[] args) {

		Car c1 = new Car();
		
		FireCar f1 = (FireCar) c1;
		f1.drive();
		f1.stop();
		f1.water();
		//1.3 
		if(f1 instanceof Car)
			Car c2 = (Car)f1;		
		
		c2.drive();
		c2.stop();
		c2.water(); //  c2 는 f1의 주소를 가르킴 , 근데 f1은 Car객체의 주소를 가르킴 / 즉, c2 는 Car객체를 가르키고 있음. 단,water메소드는 사용불가
		
		
		//1.4.1 
		Product p1 = new Tv();
		Product p2 = new Computer();
		Product p3 = new Audio(); 
		//아래와 같이 배열로 
		Product[] p = new Product[3];
		p[0] = new Tv();
		p[1] = new Computer();
		p[2] = new Audio();
		
		
							
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop");
	}
	
}

class FireCar extends Car{
	void water() {
		System.out.println("water");
	}
}
