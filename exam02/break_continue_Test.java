package exam02;
public class break_continue_Test {

	public static void main(String[] args) {
		 // break 문 , continue 문

	       for(int n = 1;n<6; n++ ){
	           if(n==3)break;
	           System.out.println("hello: "+ n);
	       }

	       for(int n = 1;n<6; n++ ){
	    	   System.out.println("world1: "+ n);
	           if(n==3)continue;
	           System.out.println("world2: "+ n);
	           System.out.println("world3: "+ n);
	       }

	       System.out.println("end");
 }
}
