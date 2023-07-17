package exam04_3;

public class Cat {

	//인스턴스 변수
	String name;
	int age;
	String gender;
	
	//생성자
	public Cat() {}
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//메서드
	
	// getter 메서드
	// 이름 얻기 : 파 X, 리 O
	public String getName() {
		return name;
	}
	// 나이 얻기
	public int getAge() {
		return age;
	}
	// 성별 얻기
	public String getgender() {
		return gender;
	}
	//setter 메서드
	// 나이수정
	public void setAge(int age) {
		this.age = age; 
	}
	// 이름수정
	public void setName(String name) {
		this.name = name;
	}
	// 성별수정
	public void setgender(String gender) {
		this.gender = gender;
	}
	
}