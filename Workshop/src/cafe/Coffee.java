package cafe;

public class Coffee {

	private String name;
	private int price;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + " " + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
