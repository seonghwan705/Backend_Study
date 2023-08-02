package cafe;

public class Cafe {

	// Cafe has a Coffee 목록

	private Coffee coffeeList[]; // 배열 선언만 하고 생성은 안한 상태.
	private int index; // 0

	public Cafe() {
		// 생성자 실행 시 배열(인스턴스 변수) 생성 및 초기화

		coffeeList = new Coffee[3];

	}

	public void setCoffee(Coffee coffee) {
		if (index == coffeeList.length) {
			System.out.println("더 이상 저장할 수 없습니다");
		} else {
			coffeeList[index] = coffee;
			index++; // 0, 1, 2 => 최종 3크기까지 저장
		}

	}

	public int totalPrice() {
		int totalPrice = 0;
		for(Coffee coffee: coffeeList) {
			totalPrice+=coffee.getPrice();
		}
		return totalPrice;
	}

	public Coffee[] getCoffeeList() {
		return coffeeList;
	}

}
