package exam02;

public class OperatorTest {

	public static void main(String[] args) {
		// 1. 산술연산자
		int n=10;
		int n2=3;
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/3.0); // 정수와 실수의 연산 => 실수
		float f=n/n2;
		System.out.println(f); // 3.0
		
		System.out.println(n%n2); 
		
		// + : 연결연산자로서 사용가능
		String k=10+20+30+"hello";
		String k2="hello"+10+20+30;
		System.out.println(k); // 60hello
		System.out.println(k2); // hello102030
	}

}
