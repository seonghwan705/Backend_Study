
	package exam06;

	public class Cat {

		String name;
		int age;
		
		public void eat() {
			System.out.println("Cat.eat");
		}
		public void sleep() {
			System.out.println("Cat.sleep");
		}
		public void run() {
			System.out.println("Cat.run");
		}
		
		
		public Cat() {}
		
		public Cat(String name, int age) {
			this.name = name;
			this.age = age;
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

	}

