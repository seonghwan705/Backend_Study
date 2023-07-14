package exam03;

import java.util.Arrays;

public class Array_Test6 {

	public static void main(String[] args) {

		// 1. 2차원 배열 출력
		
		// 가. 배열선언
		int [][] n;
		
		// 나. 배열 생성
		n = new int[3][2];
		
		System.out.println("행의길이:" + n.length);
		System.out.println("1행의 열길이:" + n[0].length);
		
		// 0 으로 자동 초기화
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		
		for(int i=0; i< n.length; i++) { //행
			for(int j=0; j<n[i].length; j++) { // 열
				System.out.println(">>"+ n[i][j]);
			}
		}
		// 명시적 초기화
		n[0][0]=1;
		n[0][1]=2;
		n[1][0]=3;
		n[1][1]=4;
		n[2][0]=5;
		n[2][1]=6;
		
		
		// foreach문
		/*
		 *     for(변수:배열명){ // JS의 for-of 동일
		 *     
		 *     }
		 * 
		 */
		for(int []x : n) {
			for(int x2 : x) {
				System.out.println("$$" + x2);
			}
		}
	}

}