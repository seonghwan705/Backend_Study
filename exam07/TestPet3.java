package exam07;

public class TestPet3 {

	public static void a(Pet p) {
	}

	public static void b(Object obj) {
	}

	public static void main(String[] args) {

		// 다형성 활용
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");

		a(c1);
		a(d1);
		a(b1);
		// 확장
		b(10);
		b(3.14);
		b(true);
		b(c1);
		b("hello");
	}

}