package exam07;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}
	// 오버라이딩
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}
	
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);
	}
	
	
}
