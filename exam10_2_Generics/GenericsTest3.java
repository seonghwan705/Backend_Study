package exam10_2_Generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// <?>




public class GenericsTest3 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		
		printData(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		
		printData(list2);
	}
	
	public static void printData(List<?> xxx) { // 한번에 여러 타입 받아줌 : ? 
		System.out.println(xxx);
	}

}
