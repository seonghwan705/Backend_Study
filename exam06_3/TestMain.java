package exam06_3;

class Parent{ // 부모
	int age = 20;
}
class Child extends Parent{ // 자식
	
	int age = 10;
	public void info() {
		System.out.println(age); // this.age, 10
		System.out.println(super.age); // 20
	}
}




public class TestMain {

	public static void main(String[] args) {
		
		Child c = new Child(); // Parent객체 생성, Child 객체 생성
		c.info();
	}

}
