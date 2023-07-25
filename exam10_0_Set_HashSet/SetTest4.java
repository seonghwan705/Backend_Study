package exam10_0_Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		// Set 계열 : 순서가 없고 중복이 불가한 자료구조
		// 저장하는 type을 제한할 수 있다 => 제네릭스 (generics) : <type>
		// 정수만 저장 => wrapper 클래스로 사용해야 한다.
		
		HashSet<Integer> set = new HashSet<>(); // 뒤에 타입 생략가능
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set.add(10); // 오토박싱 : 기본형 => 참조형
		set.add(20); // 오토박싱 : 기본형 => 참조형
//		set.add("helo"); // 에러
		
		for (int i : set) { // 오토 언박싱
			System.out.println(i);
		}
		
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.println(">>> : "+num);
		}
		
		}
	}
