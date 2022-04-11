//Q.12

public class Student {

	String name;
	int age;
	String address;

	public void set_Info(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void set_Info(String name, String address, int age) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.set_Info("Mr.X", "Ap-pune", 212);
	}
}
