package exam07_7_coupleling.루즈;

public class OracleDAO implements DBDAO {

	//OracleDB 연동하는 메서드
	@Override 
	public void connect() {
		System.out.println("OracleDAO.connect_oracle");
	}
}