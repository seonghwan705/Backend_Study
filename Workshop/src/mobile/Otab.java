package mobile;

public class Otab extends Mobile {

	@Override
	public int operate(int time) {
		int size = getBatterySize()-(time*12);
		setBatterySize(size);
		return size;

	}

	@Override
	public int charge(int time) {
		int size = getBatterySize()+(time*8);
		setBatterySize(size);
		return size;
	}

	public Otab() { // 생성자
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
}
