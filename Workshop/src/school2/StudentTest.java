package school2;
public class StudentTest {

	public static void main(String[] args) {

//		Student s1 = new Student("홍길동", 15, 171, 81);
//		Student s2 = new Student("한사람", 13, 183, 72);
//		Student s3 = new Student("임걱정", 16, 175, 65);
		
		// 1. 배열생성 - new 이용
		Student [] studentArray = new Student[3];
		studentArray [0] = new Student("홍길동", 15, 171, 81);
		studentArray [1] = new Student("한사람", 13, 183, 72);
		studentArray [2] = new Student("임걱정", 16, 175, 65);
		
		// 2. 리터럴 방법
				Student [] studentArray2 = { 
						new Student("홍길동", 15, 171, 81),
						new Student("한사람", 13, 183, 72),
						new Student("임걱정", 16, 175, 65)
				};
				
				// 3. new + 리터럴
				Student []studentArray3 = new Student[] {
						new Student("홍길동", 15, 171, 81),
						new Student("한사람", 13, 183, 72),
						new Student("임걱정", 16, 175, 65)};
				
				double totalAge=0.0;
				double totalHeight=0.0;
				double totalWeight=0.0;
				
				// for each문
				System.out.println("이름\t 나이\t 신장\t 몸무게");
				for(Student stu :studentArray) {
					System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getHeight()+"\t"+stu.getWeight());
					totalAge = totalAge + stu.getAge();
					totalHeight = totalHeight + stu.getHeight();
					totalWeight = totalWeight + stu.getWeight();
				}
				System.out.printf("나이의 평균: %.2f \n", totalAge/3);
				System.out.printf("키의 평균: %.2f \n", totalHeight/3);
				System.out.printf("몸무게의 평균: %.2f \n", totalWeight/3);
				
				System.out.printf(String.format("몸무게의 평균: %.2f \n", totalWeight/3));
				


	}

}
