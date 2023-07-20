package exam07;

public class Cat extends Pet{
	public void run() {
		System.out.println("Cat.run");
	}
	
	// 오버라이딩
	@Override
	public void eat() {
		super.eat();
	}

	@Override
	public void sleep() {
		super.sleep();
	}

	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);}
	
	
	
}
