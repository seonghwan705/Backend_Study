package workshop_01;
public class Test06 {
	public static void main(String[] args) {
		for (int inx = 1; inx <= 6; inx++) {
			for (int jnx = 1; jnx <= 6; jnx++) {
				for (int knx = 1; knx <= 6; knx++) {
					if ((inx * jnx * knx) % 3 == 0) {
						System.out.println(inx + "*" + jnx + "*" + knx + " = " + (inx * jnx * knx));
					} // if
				} // for
			} // for
		} // for
	}
}
