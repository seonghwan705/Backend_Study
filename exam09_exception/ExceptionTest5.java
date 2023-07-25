package exam09_exception;


class Test4{
	
	public void b() throws ArithmeticException {
		System.out.println("Test.a");
		//연산 작업
		// ArithmeticException 발생 가능한 코드
		int num = 0;
		int result= 10/num;  
		System.out.println("결과값:" + result);
	}
	public void a() throws ArithmeticException {
	    b();
	}
}

public class ExceptionTest5 {
	public static void main(String[] args) {
		// 정상종료
		System.out.println("1");
		System.out.println("2");
		Test4 t = new Test4();
		try {
			t.a();
		}catch(ArithmeticException e) {
			System.out.println("error: 0 으로 나누어 발생");
		}
		System.out.println("end. 정상종료");

	}

}