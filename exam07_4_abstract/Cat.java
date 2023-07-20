package exam07_4_abstract;

public class Cat extends Pet{
	public void run() { // Cat의 메서드
		System.out.println("Cat.run");
	}
	
	// 오버라이딩
	@Override
	public void eat() { // Pet에게 상속받은 추상메서드
		
	}
	@Override
	public void sleep() { // Pet에게 상속받은 추상메서드
		
	}

	public Cat() {} // 생성자
	public Cat(String name, int age) { // 생성자
		super(name, age);}
	
	
	
}
