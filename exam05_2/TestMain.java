package exam05_2;

class Count{
	int n; // 인스턴스 변수라 누적이 안됨, 객체생성할때마다 매번 생성됨
	static int m; // 공통 데이터 저장, 누적가능, 프로그램 실행할 때 한번 생성, 이탤릭체, 자동초기화, 클래스명으로 접근
	public Count() { // 생성자
		n++;
		m++;
	}
	public void n_print() { // 인스턴스 메서드
		System.out.println("n: "+n); // 인스턴스 변수 접근 가능
		System.out.println("m: "+m); // static 변수 접근 가능
	}
	
	public static void m_print() { // static 메서드
//		System.out.println("n: "+n); // 인스턴스 변수 접근 불가
//		System.out.println(this); // this(인스턴스) 사용불가
		
// static이 먼저 만들어지고, 인스턴스는 나중에 만들어지기 때문에 인스턴스 쪽으론 접근불가
	}
} // end class


public class TestMain {

	public static void main(String[] args) {
		// 인스턴스 생성 전 (new하기 전)에 static 접근가능
		System.out.println(Count.m); // 기본 초기화값 0
		Count.m_print(); // new 하지않고 메서드 사용목적
		
		// Count 객체생성을 몇번 했는지 ?
		Count c = new Count();
		c.n_print();
		Count c2 = new Count();
		c2.n_print();
	}

}
