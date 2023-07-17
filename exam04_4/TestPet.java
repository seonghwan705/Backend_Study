package exam04_4;

public class TestPet { // 클래스
	
	public static void main(String[] args) {
	Cat c = new Cat("야옹이", 2, "암컷");
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getGender());
	System.out.println("----------------------------");

	// 수정
	c.setName("망치");
	c.setAge(3);
	
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getGender());
	System.out.println("----------------------------");

	// 수정2
	c.setCat(4, "수컷");
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getGender());
	
	
	
	// getCat 호출
	System.out.println("----------------------------");
	String result = c.getCat("나비", 2, "암컷");
	System.out.println(result);
	
	System.out.println("----------------------------");
	c.xxx();
	System.out.println("end");
	System.out.println("----------------------------");
	
	c.yyy(10);
	
	}	
	
}
