package exam04_3;

public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이", 2, "암컷");
		
		//출력1 - 인스턴스 변수 직접 접근 (권장 안함 )
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.gender);
		System.out.println("---------------------------");
		//출력2 - getter 메서드 이용 접근
		String name = c.getName();
		System.out.println(name);
		int age = c.getAge();
		System.out.println(age);
		System.out.println(c.getgender());
		System.out.println("---------------------------");
		
		//수정1 - 인스턴스 변수 직접 수정 (권장 안함 )
		c.age=3;
		System.out.println(c.getAge());
		
		System.out.println("---------------------------");
		//수정2 - setter 메서드 이용 수정
		c.setAge(3);
		c.setName("망치");
		c.setgender("수컷");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getgender());
		
		
	}

}