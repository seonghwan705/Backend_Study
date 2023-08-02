package workshop_01;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오 ");
		int numberValue = scan.nextInt();
		int resultValue = 0;
		for (int inx = 1; inx <= 100; inx++) {
			if ((inx % numberValue) == 0) {
				resultValue += inx;
				if(inx!=numberValue)System.out.print("+");
				System.out.print(inx);
				
			}
		}//end for
		System.out.print(" = " + resultValue);
	}//end main
}
