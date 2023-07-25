package exam10_3_Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// iterator는 set과 list만 사용가능
		// Map 은 순서가 없다.
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // key 중복시 덮어쓰기
		
		// 출력방법 1 - toString
		
		System.out.println(map.toString());
		System.out.println("----------------------------------");
		
		// 출력방법 2 - get (key) ==> hashmap은 index가 key값; 
		
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p3"));
		System.out.println(map.get("x")); // key가 없으면 null 반환
		System.out.println("----------------------------------");
		
		// 출력방법 3 - keySet() ==> key값을 반환 (주로 key가 많을 때 사용)
		
		Set<String> keys = map.keySet(); // HashSet 의 부모인 Set => 다형성으로 생성
		System.out.println(keys.toString());
		System.out.println("----------------------------------");
		
		// 출력방법 4 - for each 
		
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		

	}

}
