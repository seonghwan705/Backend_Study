package exam04_5;

// 하나의 클래스에서 여러개의 클래스 정의 가능 ==> 개인적으로 실습할 때 사용 (공부할때만 사용, 현업에선 불가)
class Cat {
	
	String name;   // 인스턴스 변수
	int age;
	String gender;
	
	public Cat() { // 기본생성자
	}

	public Cat(String name, int age, String gender) { // 생성자 오버로딩
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
} // end Cat


public class TestPet {
	
	// PDT ( call by value )
	public static void pdt(int x) {
		x=20;
	}
		
	// RDT ( call by value reference)
	public static void rdt(Cat x) {
		x.setAge(10);
	}

	public static void main(String[] args) {
		
		//기본형
		int n = 10;
		System.out.println("호출전:" + n);
		pdt(n);
		System.out.println("호출후:" + n);
		
		//참조형
		Cat c = new Cat("야옹이", 2, "암컷");
		System.out.println("호출전 나이:" + c.getAge());
		rdt(c);
		System.out.println("호출후 나이:" + c.getAge());
		

	}

}
