package exam08_1_String;

import java.util.Calendar;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) throws Exception {

		// 구분자를 지정하여, 배열로 변환해주는  "split" 보다 더 강력하다.
		// 구분자를 여러개 지정하여 토근형태로 나눔.
		
		// 1. 기본형태
		String s = "aaa/bbb/ccc";

		StringTokenizer st = new StringTokenizer(s, "/");
		System.out.println("token 갯수:" + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// 2. mix 형태
		String s2 = "A,ab,xx;E|XX/yy";
		StringTokenizer st2 = new StringTokenizer(s2, "/,;|");
		System.out.println("token 갯수:" + st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		
		
	}

}