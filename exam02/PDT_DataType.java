package exam02;

public class PDT_DataType {

	public static void main(String[] args) {
		// 1) 문자 리터럴 - char 기본형
		System.out.println('A');
		System.out.println('김');
		
		// 1-2) 여러 문자열 - String 참조형
		System.out.println("홍길동");
		
		// 2) escape 문자
		System.out.println("홍길\n동");
		System.out.println("홍길\t동");
		System.out.println("홍길\'동");
		System.out.println("홍길\"동");
		System.out.println("홍길\\동");
		
		// 3) 정수 리터럴
		System.out.println(10); // 10진수
		
		System.out.println(0b01); // 2진수
		
		System.out.println(01); // 8진수
		System.out.println(07); // 8진수
		
		System.out.println(0x0); // 16진수
		System.out.println(0xA); // 16진수
		System.out.println(0xF); // 16진수
		
		// 4) 실수 리터럴
		System.out.println(3.14); // double로 처리
		System.out.println(3.14D); // double로 처리
		System.out.println(3.14d); // double로 처리
		
		System.out.println(3.14F); // float로 처리
		System.out.println(3.14f); // float로 처리

		System.out.println(3.14e3); // 지수표현
		
		// 4byte인 int 저장범위 : -2147483648 ~ + 2147483647
		System.out.println(2147483647); 
		System.out.println(2147483647L); // 4byte 범위보다 큰 정수는 L지정해서 long으로 처리
		
		// 5) 논리 리터럴
		System.out.println(true);
		System.out.println(false);
	
	}

}
