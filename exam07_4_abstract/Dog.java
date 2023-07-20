package exam07_4_abstract;

public class Dog extends Pet {
	String gender;
	
	// 오버라이딩
	@Override
	public void eat() { // Pet에게 상속받은 추상메서드
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() { // Pet에게 상속받은 추상메서드
		System.out.println("Dog.sleep");
	}

	public Dog() {} // 생성자
	public Dog(String name, int age) { // 생성자
		super(name, age);
	}
	public Dog(String name, int age, String gender) { // 생성자
		super(name, age);
		this.gender = gender;
	}
	public String getgender() { // getter
		return gender;
	}
	public void setgender(String gender) { // setter
		this.gender = gender;
	}
	
	


}
