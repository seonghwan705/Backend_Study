package backjoon_problem;

import java.util.Scanner;

public class problem_2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,c ;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int money;
		int max=0;
		if ( a==b && b==c) {
			money = 10000 + a*1000;
			System.out.println(money);
		}
		else if ( a==b && b!=c) {
			money = 1000 + a*100;
			System.out.println(money);
		}
		else if ( a!=b && b==c) {
			money = 1000 + b*100;
			System.out.println(money);
		}
		else if ( a==c && b!=c) {
			money = 1000 + a*100;
			System.out.println(money);
		}
		else if ( a!=b && b!=c) {
			if(a>b) {
				max =a;
				if(c>a) {
					max =c;
				}
			}
			else if(b>a){
				max=b;
				if(c>b) {
					max=c;
				} else {
					max=b;
				}
			}
			money = max * 100;
			System.out.println(money);
		}
		
	}
}
