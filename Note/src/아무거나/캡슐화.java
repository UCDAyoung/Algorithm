


package 아무거나;

//좋 않은 코드  
class notCorrect_Time{
	int time;
	int minutes;
	int seconds;
}
//좋은 코드 멤버변수에 바로 접근을 허용하게 하는 것보다,메소드를 통해 접근하게 하는 것이 더 좋은 코드이다.
class Correct_Time{
	private int time;
	private int minutes;
	private int seconds;
	
	
	public int getTime() {
		return this.time;
	}
	public int getMinute() {
		return this.minutes;
	}
	public int getSecond() {
		return this.seconds;
	}
}


public class 캡슐화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
