import exam05.sub.Dog;
public class DogTest {
 public static void main(String[] args) {
	 // 패키지가 다르면 기본적으로 접근이 안됨
	 // 클래스에 명시적으로 패키지 지정하는 방법! 
	 exam05.sub.Dog d = new exam05.sub.Dog();
	 exam05.sub.Dog d2 = new exam05.sub.Dog();
}}
