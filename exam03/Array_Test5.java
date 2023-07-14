package exam03;

import java.util.Arrays;

public class Array_Test5 {

	public static void main(String[] args) {

		// 1. 1차원 배열 출력
		
		
		int [] n = new int[] {10,20,30,40};
		
		// 1) 개별적으로 idx 이용
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		// 2) 일반 for문
		for(int i=0; i < n.length ; i++) {
			System.out.println(">>" + n[i]);
		}
		// 3) foreach문
		/*
		 *     for(변수:배열명){ // JS의 for-of 동일
		 *     
		 *     }
		 * 
		 */
		for(int k:n) {
			System.out.println("$$"+ k);
		}
		
		// 4) 배열==> 한번에 문자열로 출력 ( java.util.Arrays 클래스 이용 )
		// Arrays.toString(배열명);
		System.out.println(Arrays.toString(n)); // "[10, 20, 30, 40]"
		
	}

}