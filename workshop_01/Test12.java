package workshop_01;
//Scanner 클래스를 사용하여 키보드로 2자리의 양의 정수값을 입력 받아서 출력하는 실습.
//단 2자리 양의 정수가 아니면 다시 입력 받는다.
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수 구하기");

		int n;
		do {
			System.out.print("정수값：");
			n = scan.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		
	}
}
