package student;

public class Test01 {

	public static void main(String[] args) {
		// Student 객체를 3개 생성
		// 각각의 객체의 평균과 학점을 화면에 출력한다. 
		
		Student s1 = new Student("Kim", 100,90,95,89);
		Student s2 = new Student("Lee", 60,70,99,98);
		Student s3 = new Student("Park", 68,86,60,40);
		
		System.out.println(s1.getName()+" 평균: "+s1.getAvg()+" 학점: "+s1.getGrade());
		System.out.println(s2.getName()+" 평균: "+s2.getAvg()+" 학점: "+s2.getGrade());
		System.out.println(s3.getName()+" 평균: "+s3.getAvg()+" 학점: "+s3.getGrade());

	}

}
