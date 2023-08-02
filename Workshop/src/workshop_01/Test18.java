package workshop_01;
import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("오른쪽 아래가 직각인 삼각형");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
		
	}
}
