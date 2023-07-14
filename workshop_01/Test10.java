package workshop_01;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기");
		int n=0;
		int sum=0;
		do {
		  System.out.print("n 값: ");
		  n = scan.nextInt();
		}while(n<=0);
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
	  System.out.printf("1부터 %d 까지의 총합: %d" , n, sum);	
		
	}
}
