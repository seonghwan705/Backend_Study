package exam04_4;

public class Cat { // 클래스
	String name;   // 인스턴스 변수
	int age;
	String gender;
	
	public Cat() { // 기본 생성자
		
	} // 오른쪽 클릭, sourse, from superclass

	public Cat(String name, int age, String gender) { // 생성자 오버로딩
		this.name = name;
		this.age = age;
		this.gender = gender;}
	// 오른쪽 클릭, sourse, using field

	
	// name 변수 getter and setter
	public String getName() { // 오른쪽 클릭, sourse, getter and setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// age 변수 getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// gender 변수 getter and setter
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	} 
	
	// 메서드 수정
	// 이름과 나이를 한꺼번에 수정
	public void setCat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 나이와 성별 한꺼번에 수정
	public void setCat(int age, String gender) {
		this.gender = gender;
		this.age = age;
	}
	
	// 이름, 나이와 성별 한꺼번에 수정
		public void setCat(String name, int age, String gender) {
			this.gender = gender;
			this.age = age;
			this.name = name;
		}
	
	// getter + setter 기능을 모두 포함하는 메서드	
		public String getCat(String name, int age, String gender) {
			return name + " " + age + " " + gender;
			// 리턴값은 반드시 하나만 사용가능
		}
		
		public int [] getInt() {
			return new int[] {10,20}; // 리턴값 반드시 하나만 가능
		}
		
		// 리턴타입은 void 인데  return 키워드 사용하는 경우
		// void => return 사용불가 (원래)
		
		public void xxx() {
			System.out.println("xxx1");
			if(true)return; 
			// 이렇게 사용하여  xxx(); 메서드를 중지시킬 수 있음, 반환값 주면 안됨.
			// 반복문 빠져나올 때, break 과 같은 느낌
			System.out.println("xxx2");
			System.out.println("xxx3");
		}
		// 자동형변환 : byte > short > int > long > float > double
		
		public void yyy(double n) {
			// int, long, float, double 모두가능
			xxx();
			// 자신이 자신안의 다른 메서드 호출 가능
			// this.xxx()와 동일
		}
		
	// 오버로딩 : 메서드 이름은 같고, 매개변수는 다르게;
	// 메서드 이름을 통일하는 것이 관리하기에 용이하다.
	
	
	
	
}
