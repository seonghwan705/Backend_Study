package mobile;

public class Ltab extends Mobile{

	@Override
	public int operate(int time) { // 추상메서드
		int size = getBatterySize()-(time*10);
		setBatterySize(size);
		return size;
	}

	@Override
	public int charge(int time) { // 추상메서드
		int size = getBatterySize()+(time*10);
		setBatterySize(size);
		return size;
	}

	public Ltab() {// 생성자 
		}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}		
}
