package vehicle_solution;

public class Car extends Vehicle {
	private double restOil;
	private int carWeight;

	public Car() { // 기본생성자

	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public void addOil(int oil) {
		// 오일탱크크기를 넘어서면 안된다. 
		if ( getOilTankSize() >= (restOil+oil)) {
			restOil += oil;
		} else {
			System.out.println("더 이상 오일을 넣을 수 없습니다");
		}
	}

	public void moving(int distance) {
		 restOil=restOil-(distance / getEfficiency());
	}

	public void addWeight(int weight) {
		if (maxWeight >= (carWeight+weight)) {
			carWeight += weight;
		} else
			System.out.println("더 이상 적재할 수 없습니다");
	}

	@Override
	public String toString() {
		return "최대적재량: " + maxWeight + " 오일탱크사이즈: " + oilTankSize+" 잔여오일량: "+restOil+" 현재적재중량: "+carWeight;
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCarWeight() {
		return carWeight;
	}

	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}

}
