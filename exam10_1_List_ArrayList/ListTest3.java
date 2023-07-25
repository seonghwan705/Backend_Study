package exam10_1_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		// List 계열 : 순서가 있고 중복이 가능
		// 배열과 유사, 차이점은 크기변경이 가능하다는점.
		
		List <String> list = new ArrayList<>(); // 다형성 (매우 중요)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 일반적으로 많이 사용하는 방법
		List <String> list2 = Arrays.asList("홍길동","이순신","유관순","홍길동");
		System.out.println(list2);
		
		/*
		 *    Arrays API
		 *    1) Arrays.toString(배열);
		 *    2) Arrays.asList(값,값2,값3,...);
		 */
	}

}
