import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptMain {

	public static void main(String[] args) throws Exception {
		// Configuration.xml 파일 읽기
		
		String resource = "configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		// findByDeptno 호출 ==> 단일행, 파라미터(int) 있음
		DeptDTO dto = session.selectOne("DeptMapper.findByDeptno", 10);
		System.out.println(dto);
		System.out.println("--------------------------------------------");
		
		// findAll 호출 ==> 다중행, 파라미터 x
		List<DeptDTO> list = session.selectList("DeptMapper.findAll");
		
		for (DeptDTO s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		
		// findByDeptnoAndDname 호출 ==> 다중행, 파라미터(DeptDTO) 있음, 
		DeptDTO dto2 = new DeptDTO();
		
		dto2.setDeptno(10);  	// DeptDTO에 값을 넣어서 파라미터로 전달
		dto2.setDname("인사");	// 여러 값을 한 번에 전달하고자 할 때 용이하다
		
		List<DeptDTO> list2 = 
			session.selectList("DeptMapper.findByDeptnoAndDname", dto2);
		
		for (DeptDTO s : list2) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		
		// findByDeptnoAndDnameMap
		HashMap<String, Object> map = 
				new HashMap<>();
		map.put("xxx", 10);
		map.put("yyy", "인사");
		
		List<DeptDTO> list3 = 
				session.selectList("DeptMapper.findByDeptnoAndDnameMap", map);
		
		for (DeptDTO s : list3) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");

		
		// findAllPage (행 출력 개수 제한) 
		RowBounds bounds = new RowBounds(0, 3); // 시작위치, 개수
		
		List<DeptDTO> list4 = 
				session.selectList("DeptMapper.findAllPage", null, bounds);
		for (DeptDTO xxx : list4) {
		
			System.out.println(xxx);
		}		
		session.close();
		}
	
		

}
