package exam04_2;

// 생성자를 자동생성하는 방법

public class Cat {

	String name;
	int age;
	String gender;
	
	// 기본생성자, 명시적으로 생성자를 안 만들면 자동생성된다.
	public Cat() {
	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}