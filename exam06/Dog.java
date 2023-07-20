
	package exam06;

	public class Dog {

		String name;
		int age;
		String gender;
		
		public void eat() {
			System.out.println("Dog.eat");
		}
		public void sleep() {
			System.out.println("Dog.sleep");
		}
		
		
		public Dog() {}
		public Dog(String name, int age, String sex) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getgender() {
			return gender;
		}
		public void setgender(String gender) {
			this.gender = gender;
		}
		
		
	}
