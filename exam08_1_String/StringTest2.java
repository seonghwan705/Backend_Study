package exam08_1_String;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {

	   // 메서드 
	  String s = "HeLLo";
	  // String의 클래스의 인스턴스 메서드
	  System.out.println("1. 문자열 길이:" + s.length());
	  char c = s.charAt(1);  // charAt ( ) : 문자열을 문자로 변환, 파라미터는 인덱스 번호!
	  System.out.println("2. 특정 문자 얻기:" + s.charAt(0) );
	  System.out.println("2. 특정 문자 얻기:" + c );
	  System.out.println("3. 특정 문자 위치:" + s.indexOf('e') ); // 문자 위치 : indexOf ( )
	  System.out.println("3. 특정 문자 위치:" + s.indexOf('X') );  // 없으면 -1 
	  System.out.println("4. 대문자:" + s.toUpperCase() );
	  System.out.println("5. 소문자:" + s.toLowerCase() );
	  System.out.println("6. 문자열 연결:" + s.concat(" ~~~") );
	  System.out.println("7. 부분열 추출:" + s.substring(1) );  // 1부터 끝까지
	  System.out.println("7. 부분열 추출:" + s.substring(1, 4) );  // 1~3 까지
	  System.out.println("8. 문자열 포함여부:" + s.contains("e") );
	  System.out.println("8. 문자열 포함여부:" + s.contains("X") );
	  System.out.println("9. 문자열 치환:" + s.replace("e", "X") ); // HXLLo
	  System.out.println("10. 문자열 비교:" + s.equals("HeLLo") ); // true
	  System.out.println("10. 문자열 비교:" + s.equals("hello") ); // false
	  System.out.println("10. 문자열 비교(대소문자무시):" + s.equalsIgnoreCase("hello") ); // true
	  String s2 = "     world     ";
	  System.out.println("11. 공백제거:" + s2.trim() ); 
	  System.out.println("11. 공백제거:" + s2.trim().length() ); 
	  
	  // 구분자로 분리 ==> 배열로 반환
	  String s3 = "AAA/BBB/CCC";   
	  String [] arr = s3.split("/");
	  System.out.println("12. 구분자로 분리:" + Arrays.toString(arr) ); 
	  
	  // String의 static 메서드
	  System.out.println("13. 포맷 지정:");
	  System.out.println(String.format("이름:%s, 나이:%d", "홍길동", 20)); // printf 랑 동일
	  
	  System.out.println("14. 문자열로 변경:" + String.valueOf(10));  // 숫자 10을 문자열로 변경
	  System.out.println("14. 문자열로 변경:" + String.valueOf(3.14)); // 실수 3.14를 문자열로 변경
	  System.out.println("14. 문자열로 변경:" + String.valueOf(new char[] {'A','B'})); // 크기가 2인 문자 배열을 문자열로 변경
	  
	  
	  
	  // 원본 문자열 ==> String 문자열은 변경되지 않는다. 새로운 문자열이 생성된 것이다.
	  System.out.println(s);  // HeLLo
	}

}
