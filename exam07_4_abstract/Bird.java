package exam07_4_abstract;

public class Bird extends Pet {
	String color;
	
	public void fly() { // Bird 의 메서드
		System.out.println("Bird.fly");
	}
	@Override
	public void eat() { // Pet에게 상속받은 추상메서드
		System.out.println("Bird.eat");
	}
	@Override
	public void sleep() { // Pet에게 상속받은 추상메서드
		System.out.println("Bird.sleep");
	}
	
	public Bird() { // 생성자
	}
	public Bird(String name, int age) { // 생성자
		super(name, age);
	}
	public Bird(String name, int age, String color) { // 생성자
		super(name, age);
		this.color = color;
	}
	public String getColor() { // getter
		return color; 
	}
	public void setColor(String color) { // setter
		this.color = color;
	}
}
