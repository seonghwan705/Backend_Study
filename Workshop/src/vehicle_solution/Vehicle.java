package vehicle_solution;

public class Vehicle {
	int maxWeight;
	double oilTankSize;
	double efficiency;

	public Vehicle() { // 기본 생성자

	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}

	@Override // 오브젝트의 toString 오버라이딩
	public String toString() {
		return "최대적재량: " + maxWeight + " 오일탱크사이즈: " + oilTankSize;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	
}
