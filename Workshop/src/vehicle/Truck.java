package vehicle;

public class Truck extends Car {

	public Truck() {
		
	}	
		
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}	
		
	public double getEfficiency() {
		return efficiency= efficiency -(carWeight/5)*0.2;
	}	
	public void moving(int distance) {
		 double oilConsumption1 = calcOil(distance);
		 restOil=restOil-oilConsumption1;
	}	
	public double calcOil(int distance) {
		double oil_consumption = distance / efficiency;
		return oil_consumption;
	}
	public int getCost(int distance) {
		double oilConsumption1 = calcOil(distance);
		
		return (int)oilConsumption1*3000;
	}
	public String toString() {
		return "최대적재량: " + maxWeight + " 오일탱크사이즈: " + oilTankSize+" 잔여오일량: "+restOil+" 현재적재중량: "+carWeight+" 연비: "+efficiency;
	}
	
	public int getCarWeight() {
		return carWeight;
	}

	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}
		
	
}
