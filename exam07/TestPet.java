package exam07;

public class TestPet {

	public static void main(String[] args) {

		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c1.getName(), c1.getAge());
		System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", d1.getName(), d1.getAge(), d1.getgender() );
		System.out.printf("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", b1.getName(), b1.getAge(), b1.getColor());
					
		// 2. 다형성 생성 ==> 하나의 부모타입으로 서로 다른 여러 자식 타입 참조. 
		Pet p = new Cat("야옹이", 2);
		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", p.getName(), p.getAge());
		    p = new Dog("망치", 1, "수컷");
		System.out.printf("Dog 이름: %s, Dog 나이:%d \n", p.getName(), p.getAge());
		    p = new Bird("까치", 1, "블랙");
		System.out.printf("Bird 이름: %s, Bird 나이:%d \n", p.getName(), p.getAge());
		
	}

}
