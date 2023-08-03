package backjoon_problem;

import java.util.Scanner;

public class problem_2884 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();  // 시
		int M = scan.nextInt();  // 분
		
		scan.close();
		
		if (M < 45) {
			H--;	 		// 시간 1 감소
			M = 60-(45-M);
			if (H < 0) { // H == 0 일때 H-- 로 인해 -1이 되었다면, H를 23으로 세팅
				H = 23;
			}
			System.out.println(H+" "+M);
			
		} else {
			System.out.println(H+" "+(M-45));
		}
	}

}
