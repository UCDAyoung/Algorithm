package 아무거나;

public class 함수형인터페이스 {
	static void execute(myFunction f) {
		f.run();
	}
	static myFunction getMyFunction() {
		myFunction f = () -> System.out.println("f1.run3");
		return f;
	}
	public static void main(String[] args) {
		//어차피 함수형 인터페이스는 메소드가 한 개이기 때문에,-> 뒤 문장이 바로 메소드구현부 
		myFunction f1 = ()->System.out.println("f1.run");
		//f2를 f1으로 요약한 것 
		myFunction f2 = new myFunction() {
			public void run() {
				System.out.println("f2.run");
			}
		};
		
		myFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(()->System.out.println("lastRun"));
	}

}
@FunctionalInterface
interface myFunction {
	void run();
}

