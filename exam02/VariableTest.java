package exam02;

public class VariableTest {
	int n2; // 인스턴스 변수, 자동초기화 o
	static int n3; // 클래스 변수 (static 변수), 자동초기화 o
	
	// main 메서드
	public static void main(String[] args) {
		
		int n; // 로컬변수, 자동초기화 x, 반드시 사용 전에 초기화해야한다
		n=0;
		System.out.println(n);
	}

}
