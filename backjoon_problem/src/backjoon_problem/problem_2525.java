package backjoon_problem;

import java.util.Scanner;

public class problem_2525 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int h = scan.nextInt();
			int m = scan.nextInt();
			int time = scan.nextInt();
			
			int min = 60 * h + m; // 시 ==> 분
			min += time;
			
			int hour = (min/60) % 24; // 24시 이상이 될 경우 0시부터 시작
			int minute = min % 60; // 분
			
			System.out.println(hour+" "+minute);
	}

}
