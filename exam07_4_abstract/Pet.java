package exam07_4_abstract;

public abstract class Pet {
	String name;
	int age;
	
	
	// 자식클래스에서 공통으로 사용하고자하는 메서드를 추상메서드로 구현
	// 변수, 생성자, 메서드, 추상메서드만 가질 수 있음. 추상메서드 필수아님.
	public abstract void eat();
	public abstract void sleep();
	public Pet() {
		// TODO Auto-generated constructor stub
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
