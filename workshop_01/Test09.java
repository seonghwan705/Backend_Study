package workshop_01;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값: ");
		int a = scan.nextInt();
		System.out.print("b 값: ");
		int b = scan.nextInt();
		System.out.print("c 값: ");
		int c = scan.nextInt();
		
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		System.out.println("최대값: " + max);
		
		
	}
}
