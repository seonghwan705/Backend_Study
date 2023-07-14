package workshop_01;
import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		int time = 0; //시간
		int pay = 0;  //봉급
		double bonus = 1; //시간에 따른 보너스 율
		
		Scanner scan = new Scanner( System.in );

		System.out.println( "보너스 + 월급 구하기" );
		
		System.out.printf( "근무시간입력 : " );
		time = scan.nextInt();					//근무시간
		
		System.out.printf( "월급입력 : " );
		pay = scan.nextInt();					//월급입력

		System.out.println( "====================" );

		//보너스 계산
		if( time >= 25 ) bonus = 1;
		else if( time >= 20 ) bonus = 0.8;
		else if( time >= 18 ) bonus = 0.5;
		else bonus = 0;
		System.out.println("보너스 : " + (int)( pay * bonus ) );

		//급여 계산
		System.out.println("지급될 급여 : " + (int)( pay * ( 1 + bonus ) ) );
		
	}
}
