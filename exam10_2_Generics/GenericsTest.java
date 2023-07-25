package exam10_2_Generics;

import java.util.Date;

// 제네릭스 등장배경

class Box {
	
	Object obj;
	
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue( ) {
		return obj;
	}
}


public class GenericsTest {

	public static void main(String[] args) {
		// 문자열만 저장
		
		Box b1 = new Box();
		b1.setValue("홍길동");
//		b1.setValue(10);
		String str = (String)b1.getValue(); // 무조건 형변환 해야한다.
		System.out.println("문자열 길이 : "+ str.length());
		
		// 문제 1 : 잘못된 데이터를 저장할 수 있다. 컴파일때가 아닌, 실행시 문제를 알 수 있다. 
		
		// 날짜만 저장
		Box b2 = new Box();
		b2.setValue(new Date());
//		b2.setValue(10);
		Date d = (Date)b2.getValue(); // 무조건 형변환 해야한다.
		System.out.println("날짜: "+ d.getYear());
		
		// 문제 1 : 잘못된 데이터를 저장할 수 있다. 컴파일때가 아닌, 실행시 문제를 알 수 있다. 

	}

}
