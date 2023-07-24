package exam07_7_coupleling.루즈;

public class TestMain {

	public static void main(String[] args) {
		DBService service = new DBService();
//		service.setDAO(new OracleDAO());
//		service.setDAO(new MySQLDAO());
		service.connect();
	}
}