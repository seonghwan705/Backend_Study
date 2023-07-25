package exam10_2_Generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// <? extends E> : 뒤에 element로 지정된 타입을 상속받는 타입만 받겠다는 의미

class Person {}
class Man extends Person {}
class Woman extends Person {}


public class GenericsTest4 {

	public static void main(String[] args) {
	
		
		// Man만 저장
		List<Man> list = new ArrayList<Man>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		printData2(list);
		
		// Woman만 저장
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);
//		printData2(list2);

		
		// String만 저장
		List<String> list3 = new ArrayList<String>();
		list3.add("홍길동");
		list3.add("이순신");
//		printData(list3);
//		printData2(list3);

		// Person만 저장
		List<Person> list4 = new ArrayList<Person>();
		list4.add(new Person());
		list4.add(new Person());
		printData(list4);
		printData2(list4);

	}

	// Person 및 자식만 저장하도록 강제
	public static void printData(List<? extends Person> xxx) { // 한번에 여러 타입 받아줌 : ? 
	System.out.println(xxx);
	}
	// Man 및 부모만 저장하도록 강제
	public static void printData2(List<? super Man> xxx1) { // 한번에 여러 타입 받아줌 : ? 
		System.out.println(xxx1);
		}
}

