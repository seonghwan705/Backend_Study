import java.sql.Date;  // import문 사용해서 다른 패키지 접근!

import exam05.sub.Dog;

public class DogTest3 {
 public static void main(String[] args) {
	 // 다른 패키지의 같은 클래스 접근하는 방법
	 
	Date d = new Date(25);
	
	// 직접 명시해서 패키지 접근!
	java.util.Date x = new java.util.Date();
}}
