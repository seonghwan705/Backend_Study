package workshop_01;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no;

		System.out.println("2자리의 정수를 입력하세요.");

		do {
			System.out.print("입력：");
			no = scan.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("입력값은 " + no );
		
	}
}
