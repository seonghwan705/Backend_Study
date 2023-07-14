package exam02;

public class VariableTest2 {

	public static void main(String[] args) {
		// 기본형 변수
		int num; // 변수 선언
		num =10; // 변수 초기화
		
		// 참조형 변수
		String name; // 변수 선언
		name = "홍길동"; // 변수 초기화
		
		System.out.println(num);
		System.out.println(name);
		
		// 한번에
		int age=10, height=20, weight=30; // 권장안함
		// 노란 밑줄은 사용하지 않았다는 것.
	}

}
