package exam02;

public class OperatorTest4 {

	public static void main(String[] args) {
		// 4. 논리연산자 => 실행결과는 항상 "논리값"
				// 오직 논리값과 논리값끼리만 사용가능! [ true, false ] 
				
				// 가. &&
				System.out.println(true && true);
				System.out.println(true && false);
				System.out.println(false && true);
				System.out.println(false && false);
				System.out.println();
				
				//나. || 
				System.out.println(true || true);
				System.out.println(true || false);
				System.out.println(false || true);
				System.out.println(false || false);
				System.out.println();
						
						
				//다. ! ( 부정 )
				System.out.println(!true);
				System.out.println(!false);
	}

}
