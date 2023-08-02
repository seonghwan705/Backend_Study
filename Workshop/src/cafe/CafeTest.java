package cafe;

public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe(); // Cafe의 생성자 호출로, coffeList 배열 생성
		
		Coffee c1 = new Coffee("Americano", 4000);
		Coffee c2 = new Coffee("Caffelatte", 4000);
		Coffee c3 = new Coffee("Macchiato", 4000);
		
		cafe.setCoffee(c1);
		cafe.setCoffee(c2);
		cafe.setCoffee(c3);
		
		// 배열
		Coffee coffeeList[]= cafe.getCoffeeList();
		
		for(Coffee coffee: coffeeList) {
			System.out.println(coffee.toString());
		}
		
		System.out.println(String.format("Coffee 가격의 합: %d원", cafe.totalPrice()));
		System.out.printf("Coffee 가격의 합: %d원\n", cafe.totalPrice());
	}

}
