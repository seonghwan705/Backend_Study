package exam10_1_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		// List 계열 : 순서가 있고 중복이 가능
		// 배열과 유사, 차이점은 크기변경이 가능하다는점.
		
		ArrayList<String> list2 = new ArrayList<>();
		List <String> list = new ArrayList<>(); // 다형성 (매우 중요)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 메서드 정리
		System.out.println("크기 : "+ list.size());
		
		// 수정
		list.set(1, "원균");
		
		// 삽입
		list.add(0, "강감찬");
		
		// 삭제
		list.remove(1); // 위치로 삭제
		list.remove("원균"); // 값으로 삭제, 일치하는 첫번째 값만 삭제, 모두삭제는 removeAll
		
		// 부분리스트
		List <String> subList = list.subList(0, 2); // 0~1
		System.out.println(subList);
		
		
		// 출력방법 1 - toString( ) 이용
		System.out.println(list.toString());
		
	}

}
