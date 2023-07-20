package exam07_3;

public class TestPet {

	public static void main(String[] args) {
		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이",2);
		Dog d1 = new Dog("망치",1,"수컷");
		Bird b1 = new Bird("까치",1,"블랙");
		
		c1.eat();
		c1.sleep();
		
		d1.eat();
	}

}
