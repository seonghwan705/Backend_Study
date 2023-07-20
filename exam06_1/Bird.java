package exam06_1;

public class Bird extends Pet{


	String color;
	
	public void fly() {
		System.out.println("Bird.fly");
	}
	

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}
	
	
	public Bird() {}
	public Bird(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}