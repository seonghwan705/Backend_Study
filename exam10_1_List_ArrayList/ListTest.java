package exam10_1_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		
		// List 계열 : 순서가 있고 중복이 가능
		// 배열과 유사, 차이점은 크기변경이 가능하다는점.
		// iterator는 set과 list만 사용가능
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 출력방법 1 - toString( ) 이용
		System.out.println(list.toString());
		
		// 출력방법2 - foreach문 이용
		for(String str : list) { // 다형성
			System.out.println(">> "+ str);
			}
		
		// 출력방법3 - Iterator 이용, hasNext(), next() 
		
		Iterator <String> ite = list.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("### "+ str);
			}
		
		// 출력방법4  - index 이용, list.get(idx)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
