package exam07_3;

public class Pet {
	String name;
	int age;
	
	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
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
