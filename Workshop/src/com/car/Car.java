package com.car;

public abstract class Car {
	private String name;
	private String engine;
	private int oilTankSize;	// 오일탱크 사이즈
	private int oilSize;		// 주유된 오일양
	protected int distance;		// 주행거리
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(int oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	public Car() {/*생성자 */}

	public Car(String name, String engine, int oilTankSize, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTankSize = oilTankSize;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public abstract void go(int distance); 		// 주행
	public abstract void setOil(int oilSize);	// 주유

}
