package exam06_1;

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{

	public void run() {
		System.out.println("Cat.run");
	}
	
	// 메서드 재정의 ( overriding )
	@Override  // @으로 시작하는 코드를 어노테이션(annotation)이라고 부른다.
	public void eat() {
		System.out.println("Cat.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

}
