package book;

public class BookTest {

	public static void main(String[] args) {
		Book s1 = new Book("SQL Plus   ", 50000, 5.0);
		Book s2 = new Book("Java 2.0   ", 40000, 3.0);
		Book s3 = new Book("JSP Servlet", 60000, 6.0);
	
		System.out.println("책이름	        가격	     할인율	       할인후금액");
		System.out.println("-----------------------------------");
		System.out.println(s1.getBookname()+"  "+s1.getBookPrice() +"원  "+s1.getBookDiscountRate()+"%  "+s1.getDiscountBookPrice()+"원");
		System.out.println(s2.getBookname()+"  "+s2.getBookPrice() +"원  "+s2.getBookDiscountRate()+"%  "+s2.getDiscountBookPrice()+"원");
		System.out.println(s3.getBookname()+"  "+s3.getBookPrice() +"원  "+s3.getBookDiscountRate()+"%  "+s3.getDiscountBookPrice()+"원");
		
	}

}
