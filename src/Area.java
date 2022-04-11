//Q.11
public class Area {

	public int CalaculateArea(int length, int breadth) {
		return length * breadth;
	}

	public int CalculateArea(int side) {
		return side * side;
	}

	public static void main(String[] args) {

		Area a1 = new Area();
		System.out.println("Area of Rectangle: " + a1.CalaculateArea(5, 4));
		System.out.println("Area of Square : " + a1.CalculateArea(6));
	}
}
