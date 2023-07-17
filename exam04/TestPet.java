package exam04;


// Cat과 같은 main 없는 재사용 클래스 관리목적
public class TestPet {

	public static void main(String[] args) {

		// 객체 생성
		// 클래스명  변수명 = new 클래스명();
		
		// 고양이: 야옹이 2 암컷
		Cat c = new Cat();
		//멤버 접근 ( 권장안함 )
		c.name="야옹이";
		c.age=2;
		c.gender="암컷";
		System.out.println(c.name); //멤버 접근 ( 권장안함 )
		System.out.println(c.age);
		System.out.println(c.gender);
		
		// 고양이: 망치 1 수컷
		Cat c2 = new Cat();
		c2.name="망치";
		c2.age=1;
		c2.gender="수컷";
		System.out.println(c2.name); //멤버 접근 ( 권장안함 )
		System.out.println(c2.age);
		System.out.println(c2.gender);
	}

}