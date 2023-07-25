package exam09_exception;


class Test2{
	
	public void a() {
		System.out.println("Test.a");
		//연산 작업
		try {
			int num = 0;
			int result= 10/num;  // 예외 발생 ==> 비정상종료 됨. ==> 정상종료 됨.
			System.out.println("결과값:" + result);
		}catch(ArithmeticException e) {  // 적합한 클래스, 다형성 적용 가능
			System.out.println("error: 0 으로 나누어 발생");
			System.out.println("error:" + e.getMessage()); // / by zero
			e.printStackTrace();  // 예외발생시 개발자가 디버깅용으로 사용함.
		}
		
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		// 정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test2 t = new Test2();
		t.a();
	
		System.out.println("end. 정상종료");

	}

}
