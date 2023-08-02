package vehicle;
import java.util.Scanner;
public class VehicleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Truck car = new Truck(1000,100.0,5.0);
		System.out.println(car.toString());
		System.out.println("==========================================================================");
		
		car.addOil(50);
		System.out.println("50L 주유 후");
		System.out.println(car.toString());
		System.out.println();
		
		car.calcOil(50);
		car.moving(50);		
		System.out.println("50Km 주행 후");
		System.out.println(car.toString());
		System.out.println();
		
		car.addWeight(100);  // 상속하면 자식 객체에서 부모 메서드 호출가능
		car.getEfficiency();
		System.out.println("100Kg 적재 후");
		System.out.println(car.toString());
		System.out.println();
		
		car.calcOil(30);
		car.moving(30);		
		System.out.println("50Km 주행 후");
		System.out.println(car.toString());
		System.out.println();
		
		System.out.println("요금: "+ car.getCost(30)+"원");
		
		
		
		
		
		
		
	}

}
