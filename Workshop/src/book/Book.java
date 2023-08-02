package book;

public class Book {

	String bookname;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() {
		
	}

	public Book(String bookname, int bookPrice, double bookDiscountRate) {
		this.bookname = bookname;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		double finalPrice = bookPrice -(bookPrice * (bookDiscountRate/100));
		return finalPrice;}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
	

}
