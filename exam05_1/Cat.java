package exam05_1;

public class Cat {

	// Cat 클래스의 데이터 보호
	private String name;
	protected int age;
	public String gender;
	
	public Cat() {}

	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
		//info();
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	// info메서드는 외부에서 전혀 사용하지 않음.
	// Cat 클래스의 setName메서드만 사용함.
	// 외부에는 hide 시킴 ( 외부입장에서는 복잡성이 감소효과)
	/*
	 *   은닉화(캡슐화, encapsulation)
	 *   1. 데이터 보호
	 *   2. 복잡성 감소효과
	 * 
	 */
	private void info() {
		System.out.println("info");
	}
}
	
	
	
	
	