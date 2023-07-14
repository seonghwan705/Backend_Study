package exam02;

public class OperatorTest6 {

	public static void main(String[] args) {
		// 6. 삼항 연산자 *(중첩가능)
		int num= (3>2)?100:200;
		System.out.println(num);
		
		String s = (3>2)?"A":"B";
		System.out.println(s);
	}
}
