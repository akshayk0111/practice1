//Q.13
public class Method {

	public void Overload(int n, char c) {

	}

	public void overload(char c, int n) {

	}

	public static void main(String[] args) {
		Method m = new Method();
		m.overload('A', 5);
		m.Overload(6, 'C');
	}
}
