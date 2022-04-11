//Q.10 use of this keyword
public class Students {

	int id;
	String name;

	public Students() {
		System.out.println("Default");
	}

	public Students(int id, String name) {
		this(400);
		System.out.println("in two int ,string constructor");
		this.id = id;
		this.name = name;

	}

	public Students(int id) {
		this("Ak");
		this.id = id;
		System.out.println(" int constructor");
	}

	public Students(String name) {
		this();
		this.name = name;
		System.out.println(" string constructor");

	}

	public static void main(String[] args) {

	}
}
