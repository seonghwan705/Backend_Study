package workshop_01;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("a의 값：");
		int a = scan.nextInt();

		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = scan.nextInt();
			if (b > a)
				break; // break을 만나면 해당 반복문 전체를 나간다. 
			// continue 는 해당 반복부분만 탈출하고 다음 증감식으로 이동 후 실행
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
		
	}
}
