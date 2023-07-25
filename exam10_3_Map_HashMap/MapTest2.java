package exam10_3_Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		// iterator는 set과 list만 사용가능
		// Map 은 순서가 없다.
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // key 중복시 덮어쓰기
		
		// 메서드
		System.out.println("size: "+map.size()); // 사이즈
		map.replace("p3", "세종"); // 값 수정
		map.remove("p3"); // 값 삭제
		map.clear(); // 전체 삭제
		
		// 출력방법 1 - toString
		System.out.println(map.toString());
		
		

	}

}
