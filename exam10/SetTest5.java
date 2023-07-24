package exam10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest5 {

	public static void main(String[] args) {
		// Set 계열 : 순서가 없고 중복이 불가한 자료구조
		// 저장하는 type을 제한할 수 있다 => 제네릭스 (generics) : <type>
		
		HashSet<String> set1 = new HashSet<>(); // 뒤에 타입 생략가능
		HashSet<String> set2 = new HashSet<String>();
		Set<String> set = new HashSet<>(); // 다형성 적용 (중요)
		
		// 가정 : 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
		// Set의 메서드 정리
		System.out.println("크기 : "+ set.size());
		System.out.println("값 존재 여부 : "+ set.contains("홍길동1"));
		System.out.println("값 존재 여부 : "+ set.contains("이순신"));
		System.out.println("값이 비어있는지 : "+ set.isEmpty());
		
		set.remove("홍길동3"); // 홍길동3 삭제
		set.clear(); // 전체 삭제
		
		// 출력방법 1 - toString( ) 이용
		
		System.out.println(set.toString());
				
		
		
		}
	}
