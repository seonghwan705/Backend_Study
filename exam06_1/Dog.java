package exam06_1;

public class Dog extends Pet {

	String gender;
	
	public Dog() {}
	public Dog(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//재정의
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}
	
	
	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	
}


