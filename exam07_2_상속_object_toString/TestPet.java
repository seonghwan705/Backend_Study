package exam07_2_상속_object_toString;

public class TestPet {

	public static void main(String[] args) {
	// 1. 일반 객체 생성
	Cat c1 = new Cat("야옹이",2);
	Dog d1 = new Dog("망치",1,"수컷");
	Bird b1 = new Bird("까치",1,"블랙");
		
	System.out.println(c1); // 자동으로 Object의 toString()이 호출된다
	System.out.println(d1); // 자동으로 Object의 toString()이 호출된다
	System.out.println(b1); // 자동으로 Object의 toString()이 호출된다
		
//	System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c1.getName(), c1.getAge());
//	System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", d1.getName(), d1.getAge(), d1.getgender() );
//	System.out.printf("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", b1.getName(), b1.getAge(), b1.getColor());


	}
	// 참조변수를 출력하면 자동으로 Object의 toString()이 호출된다.
	// 예시 : System.out.print(c); = System.out.print(c.toString()); 
}
