package exam07_2_상속_object_toString;

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

	@Override
	public String toString() {
		return String.format("Cat 이름: %s, Cat 나이:%d \n", name, age);
	}

	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);}
	
	
	
}
