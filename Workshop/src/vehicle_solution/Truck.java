package vehicle_solution;

public class Truck extends Car {

	public Truck() {
		
	}	
		
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}	
	@Override
	public double getEfficiency() {
		return super.getEfficiency()-(getCarWeight()/5)*0.2;
	}	
	@Override
	public void moving(int distance) {
		 double oil = calcOil(distance);
		 double oil2 = getRestOil()-oil;
		 setRestOil(oil2);
	}	
	public double calcOil(int distance) {
		return distance / getEfficiency();
	}
	public int getCost(int distance) {
		double oil = calcOil(distance);
		int cost = (int)(oil*3000);
		return cost;
	}
	@Override
	public String toString() {
		return super.toString()+" 연비: "+efficiency;
	}
	
		
	
}
