package backjoon_problem;

import java.util.Scanner;

public class problem_2753 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;
		n = scan.nextInt();
		if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
