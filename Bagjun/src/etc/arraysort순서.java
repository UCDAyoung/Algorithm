package etc;

import java.util.Arrays;

public class arraysort순서 {

	public static void main(String[] args) {
		String[] str = {"1","ABC","abc","ab","가","가나"};
		
		Arrays.sort(str);
		
		for(String s : str)
			System.out.println(s);

	}

}
// 아스키코드 순서 + 마지막 한글 
// 숫자 -> 대문자 -> 소문자 - > 한글 
// 		길이는 짧 ->긴 
//       