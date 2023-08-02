package com.car;

public class L5 extends Car implements Temp{

	@Override
	public int getTempGage() { 			// 인터페이스에서 가져온 것
		int temp=0;
		temp = temp + (int)(distance/5);
		return temp;
	}

	@Override
	public void go(int distance) { 		// 추상클래스에서 가져온 것	
		int os = getOilSize()-(int)(distance/8);
		setOilSize(os);
		getOilSize();
	}

	@Override
	public void setOil(int oilSize) {	// 추상클래스에서 가져온 것
		oilSize += oilSize;
	}
	public L5() {/*생성자*/}
	public L5(String name, String engine, int oilTankSize, int oilSize, int distance) {
	super(name, engine, oilTankSize, oilSize, distance);}
	
}
