package exam02;
import java.util.Scanner; // 다른 패키지에서 가져오는 것 "import"
public class SwitchTest {

	public static void main(String[] args) {
		// switch문
		// 스위치 문에 사용하는 데이터 타입 6가지
		// byte, short, int, cahr, String, enum
		
		System.out.println("1");
		int num = 10;

        switch(num){
            case 5: System.out.println("5"); break;
            case 10: System.out.println("10"); break;
            case 15: System.out.println("15"); break;
            default: System.out.println("default");
        }
        
        char c = 'A';

        switch(c){
            case 'A': System.out.println("A"); break;
            case 'B': System.out.println("B"); break;
            default: System.out.println("default");
        }
		
		System.out.println("end");
		
	}
}
