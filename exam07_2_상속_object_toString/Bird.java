package exam07_2_상속_object_toString;

public class Bird extends Pet {
	@Override
	public String toString() {
		return String.format("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", name, age, color);
	}

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

	public Bird() {
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
