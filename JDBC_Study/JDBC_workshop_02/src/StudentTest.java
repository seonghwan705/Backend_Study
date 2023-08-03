import java.util.ArrayList;
import java.util.Scanner;

import com.dto.Student;
import com.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {

		
		while (true) {
			System.out.println("******************************");
			System.out.println("    [학생 정보 관리 메뉴]      ");
			System.out.println("******************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("0. 종료");
			System.out.println("******************************");
			Scanner scanner = new Scanner(System.in);
			System.out.print("메뉴 입력 => ");
			int  n = scanner.nextInt();
			if (n == 1) {
				StudentService service = new StudentService();
				ArrayList<Student> list = service.selectAllStudent();
				System.out.println("==========================================================");
				System.out.println("학번\t이름\t주민번호\t주소\t입학년도\t휴학여부");
				System.out.println("----------------------------------------------------------");
				for (Student s : list) {
					System.out.println(s.getStuNo() + "\t" + s.getStuName() + "\t" + s.getStuSsn() + "\t"
							+ s.getStuAdress() + "\t" + s.getEntDate() + "\t" + s.getAbsYn());
				}
				System.out.println("총 학생 수 : " + list.size() + "명");
			} else if(n == 2) {
				System.out.print("검색할 학생명을 입력하시오 => ");
				String str = scanner.next();
				StudentService service = new StudentService();
				ArrayList<Student> list = service.selectByName(str);
				System.out.println("==========================================================");
				System.out.println("학번\t이름\t주민번호\t주소\t입학년도\t휴학여부");
				System.out.println("----------------------------------------------------------");
				for (Student s : list) {
					System.out.println(s.getStuNo() + "\t" + s.getStuName() + "\t" + s.getStuSsn() + "\t"
							+ s.getStuAdress() + "\t" + s.getEntDate() + "\t" + s.getAbsYn());
				}
				System.out.println("총 학생 수 : " + list.size() + "명");
				
			} else if (n == 0) {
				System.out.println("프로그램이 종료 되었습니다.");
				System.exit(0);
			}
		} // end while
	}// end main
}
