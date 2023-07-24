package exam08_익명클래스;


interface Flyer{ // 인터페이스
	public abstract void fly(); // 추상메서드
}

// 이름있는 클래스
class Bird implements Flyer {
	public void fly() {
		System.out.println("Bird.fly");
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		// 1. 이름있는 클래스 다형성으로 객체생성 후, 함수 호출
		Flyer f = new Bird(); // 다형성, 본인 객체생성 X
		f.fly();
		
		// 2. 익명 클래스 사용한 경우
		/*
		 * 		인터페이스명 변수명 = new 인터페이스명(){추상메서드 재정의(오버라이딩)};
		 * 
		 * 
		 * 
		 */

		Flyer f2 = new Flyer() { // 익명클래스 구문, 단축키 : ctrl+스페이스바
				// 인터페이스명 변수명 = new 인터페이스명 ( ) { };
			@Override
			public void fly() {
				System.out.println("익명클래스.fly");
			}
			
		};
		f2.fly();
		
	}

}
