package exam02;
public class FOR_Test {

	public static void main(String[] args) {
		// for문
		// 1. 기본
	       for(int n = 1;n<6; n++ ){
	    	   System.out.println("hello");
	       }

	       // 2. 특화된 코드
	       for(int n = 5; n>0 ; n-- ){
	    	   System.out.println("world1");
	       }

	       for(int n = 1; n < 10 ; n+=2 ){
	    	   System.out.println("world2");
	       }

	       for(int n=1,n2=1; n<10 && n2 < 3 ; n+=2,n++ ){
	    	   System.out.println("world3");
	       }
	       
	       // 중첩
	       for(int n = 1;n<6; n++ ){
	           for(int n2=1; n2 < 3; n2++){
	        	   System.out.println("world4");
	           }
	       }

		
	}
}
