package exam06_2;


// Cat, Dog, Bird 의 부모 클래스
public class Pet {
	
	String name;
	int age;

	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	// 생성자
	public Pet() {
		System.out.println("Pet 생성자");
	}
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	
	
	
}