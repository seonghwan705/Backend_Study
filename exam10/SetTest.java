package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// Set 계열 : 순서가 없고 중복이 불가한 자료구조
		
		HashSet set = new HashSet();
		
		set.add("홍길동");
		set.add(20);	// 자동으로 auto boxing
		set.add(3.14);	// 자동으로 auto boxing
		set.add('A');	// 자동으로 auto boxing
		set.add(true);	// 자동으로 auto boxing
		
		set.add("홍길동");
		set.add(20);	// 자동으로 auto boxing
		set.add(3.14);	// 자동으로 auto boxing
		set.add('A');	// 자동으로 auto boxing
		set.add(true);	// 자동으로 auto boxing
		
		// 출력방법 1 - toString( ) 이용
		System.out.println(set.toString());
		
		// 출력방법2 - foreach문 이용
		for(Object obj : set) { // 다형성
			System.out.println(">> "+obj);
		}
		
		// 출력방법3 - Iterator 이용, hasNext(), next()
		// 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법 
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("### "+ite.next());
		}
	}

}
