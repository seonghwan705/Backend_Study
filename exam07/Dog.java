package exam07;

public class Dog extends Pet {
	
	String gender;
	
	// 오버라이딩
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getgender() {
		return gender;
	}
	
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	


}
