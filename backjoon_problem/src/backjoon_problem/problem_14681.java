package backjoon_problem;

import java.util.Scanner;

public class problem_14681 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if (x > 0 && y > 0 ) {
			System.out.println(1);
		}
		if (x > 0 && y < 0 ) {
			System.out.println(4);
		}
		if (x < 0 && y > 0 ) {
			System.out.println(2);
		}
		if (x < 0 && y < 0 ) {
			System.out.println(3);
		}
	

	}

}
