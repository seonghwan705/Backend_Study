package exam02;

public class TypeCastTest {

	public static void main(String[] args) {
		// 1. 묵시적 형 변환
		// upcasting
		// 가. byte > short > int > long > float > double
		// 작은 타입을 큰 타입에 저장하는 것은 가능, 큰 타입=작은타입;
		
		byte b=10;
		short b2=b; // 1byte => 2byte 변경
		int b3=b2; // 2byte => 4byte 변경
		long b4=b3;
		float f=b4;
		double f2=f;
		double f3=f2;
		
		// 큰 타입을 작은 타입에 저장하는 것은 불가능!! => 해결법 : 강제적 형 변환
		// 'a'= 97 'A'= 65 : 아스키 코드
		
		// 나. char => int
		char c='A'; // 65
		char c2='a'; // 97
		int n=c; 
		int n2=c2;
		System.out.println(n+" 아스키 코드 외우기 "+n2);
		System.out.println('A'+1); // 문자(char:한글자)는 연산이 가능하다. 
		
		// 다. int보다 작은 데이터형의 연산은 int로 반환
		short s=10;
		short s2=10;
		int s3=s+s2; // short = int 로 저장해야함
		System.out.println(s3);
		
		// 라. 큰타입과 작은 타입의 연산은 큰 타입으로 반환
		float ff=3.14F; // f붙여야됌, 기본값이 D(double임)
		int mm=10;
		float ff2=ff+mm;
		
		
	}

}
