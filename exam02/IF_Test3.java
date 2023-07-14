package exam02;
import java.util.Scanner; // 다른 패키지에서 가져오는 것 "import"
public class IF_Test3 {

	public static void main(String[] args) {
		// 3. 다중 if문
		System.out.println("1");
		int num = 70;
        if(num >= 90){
            System.out.println("A 학점");     
        }else if(num >= 80){            
        	System.out.println("B 학점");
        }else if(num >= 70){
        	System.out.println("C 학점");
        }else{
        	System.out.println("D 학점");
        }
		
		
		
		
		System.out.println("end");
		
	}
}
