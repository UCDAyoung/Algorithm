/* ***function 패키지 매개변수 1개*** 
 *  함수형 인터페이스	 |   매개변수 1개 				  |	메소드  
 * Consumer<T> 	 |  (입력 매개변수  출력 x)    	  | void accept(T t)  
 * Supplier<T>   |  (입력 x      출력 매개변수)   | T get()
 * Function<T,U> |  (입력 매개변수 출력 매개변수)	  | T apply(U u) 
 * Predicate<T>  |  (입력 매개변수 출력 boolean)	  | boolean test(T t)
 * 추가로 
 * Runnable  | 입력 x 출력 x | void run()   java.lang 패키지임  
 * 
 * 
 * ***function 패키지 매개변수 1개***
 *  함수형 인터페이스	 |   매개변수 2개 				      |	메소드  
 * BiConsumer<T,U> 	 |  (입력 매개변수  출력 x)    	      | void accept(T t,U u)  
 * Function<T,U, R>  |  (입력 매개변수 2 출력 매개변수 1 )	  | T apply(U u,R r) 
 * Predicate<T,U>    |  (입력 매개변수 2 출력 boolean)	  | boolean test(T t, U u)
 *   
 * ***매개변수 타입과 반환형 타입이 같을 시*** 
 * 단항연산자라고 부름 : UnaryOperator<T>   T apply <T t>
 * 이항연사자라고 부름 : BinaryOperator<T>  T apply <T t, T t>
 *  
 * 
 */
package 아무거나;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class function패키지 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer,Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s,list);
		System.out.println(list);
		makeEvenList(c,p,list);
		List<Integer> newList = makeChange(f,list);
		System.out.println(newList);
		
	}
	public static <T> List<T> makeChange(Function<T,T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size()); //list크기만큼 만들려고 list를 매개변수로  
		for(T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}
	public static <T> void makeEvenList(Consumer<T> c,Predicate<T> p ,List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");
		
				
	}
	public static <T> void makeRandomList(Supplier<T> s,List<T> list) {
		for(int i=0; i<10;i++) {
			list.add(s.get());
		}
	}
	
	

}
