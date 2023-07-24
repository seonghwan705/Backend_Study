package exam09;

import java.io.IOException;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
	public void c() throws RuntimeException{}
}

class Child extends Parent{
	
	//재정의는 같거나 축소 및 같은 계열만 사용하는 형태로 사용
	public void a() {}
	public void b() throws ArithmeticException {}
	// public void c() throws IOException {}  
}

public class ExceptionTest7 {
	public static void main(String[] args) {
	

	}

}
