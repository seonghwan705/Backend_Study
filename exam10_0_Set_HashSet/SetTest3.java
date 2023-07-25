package exam10_0_Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		// Set 계열 : 순서가 없고 중복이 불가한 자료구조
		// 저장하는 type을 제한할 수 있다 => 제네릭스 (generics) : <type>
		
		HashSet<String> set = new HashSet<>(); // 뒤에 타입 생략가능
		HashSet<String> set2 = new HashSet<String>();
		
		// 가정 : 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
//		set.add(10);
		
		// 출력방법 1 - toString( ) 이용
		
		System.out.println(set.toString());
				
		// 출력방법2 - foreach문 이용
		
		for(Object obj : set) { // 다형성
			String str = (String)obj;
			System.out.println(">> "+str.concat(" 님"));
		}
		
		// 출력방법3 - Iterator 이용, hasNext(), next()
		// 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법 
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("%% : "+ str);
			}
					
		
		/*  [ 제네릭스를 안쓰면 ]
		 1) 잘못된 데이터를 저장한 것을 실행시점에 알 수 있다.
		 2) 무조건 형변환이 필요하다.
		
		 	[ 제네릭스를 쓰면 ]
		 1) 잘못된 데이터를 저장한 것을 컴파일 시점에 알 수 있다.
		 2) 형변환이 필요없다. */
		
		}
	}
