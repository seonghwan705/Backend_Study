package exam07_4_abstract;

public class TestPet {

	public static void main(String[] args) {
		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이",2);
		Dog d1 = new Dog("망치",1,"수컷");
		Bird b1 = new Bird("까치",1,"블랙");
		
		
		// 추상메서드를 이용하여 유지보수가 용이하게 메서드를 통합관리!
		
		c1.eat();
		c1.sleep();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		
		// 추상클래스는 객체생성 불가
//		Pet p = new Pet();
		
		// 다형성 : 부모 참조변수가 여러 자식 객체를 호출하는 것
		// 이점 : 여러가지 객체를 한 가지 변수명으로 통합관리 가능
		Pet p = new Cat();
	}

}
