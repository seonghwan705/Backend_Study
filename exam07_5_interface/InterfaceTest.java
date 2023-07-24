package exam07_5_interface;

// 인터페이스
interface Y1{ // 인터페이스가 가질 수 있는 것 : 상수, 추상메서드, default메서드, static메서드
	
	// 1) 상수
	final int NUM=10; 
	// 상수(변하지 않고 고정된 값)엔 final 붙여야함, 자동으로 public static final 지정된다.
	int SIZE=20; // 변수처럼 보이지만, 변수가 아닌 상수
	final char[] COUNT = null;
	public static final int count = 30; // 권장
	
	// 2) 추상메서드 (인터페이스를 사용하는 가장 큰 목적)
	public abstract void a(); // 권장
	public void a2(); // 자동으로 abstract 지정
	void a3(); // default 접근지정자로 보이지만, 자동으로 public abstract 지정
	
	// default 메서드
	public default void b() {
		System.out.println("default 메서드");
	}
	// static 메서드 
	public static void c() {
		System.out.println("static 메서드");
	}
}
// 인터페이스
interface Y2{
	public abstract void x();
}
interface Y3{
	public abstract void x2();
}

// 인터페이스 to 클래스 : 구현 
class K implements Y2{  // 인터페이스의 메서드를 반드시 자식이 재정의 후 사용해야함
	@Override
	public void x() {	// 필수
	} 
}

class K2 implements Y2,Y3{ // 다중 구현 가능
	@Override
	public void x() { // 필수
	}  
	@Override
	public void x2() { // 필수
	} 
}

// 인터페이스 to 인터페이스 : 인터페이스 간 상속가능, 다중상속가능
interface Y4 extends Y2, Y3 { 
	
}

// 상속 및 구현 : 동시에 가능!
class K3 extends Object implements Y2, Y3{
	@Override
	public void x2() {}
	@Override
	public void x() {}
}

class Z implements Y1{

	@Override
	public void a() {	
	}
	@Override
	public void a2() {	
	}
	@Override
	public void a3() {	
	}
	
}



public class InterfaceTest {

	public static void main(String[] args) {
		
//		Y2 y = new Y2(); // new (객체 생성) 불가
		K k = new K();
		k.x();
		
		// 다형성 : 클래스 K의 인터페이스가 Y2 (상위버전)
		Y2 k2 = new K(); // 따라서 참조타입으로 설정가능하여 다형성을 만들 수 있음
		k2.x();
		
		Z z = new Z();
		z.a();
		z.a2();
		z.a3();
		System.out.println(Y1.NUM);
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b(); // default 메서드는 일반클래스의 concrete 메서드처럼 사용한다.
		Y1.c(); // static 메서드 
	}

}
