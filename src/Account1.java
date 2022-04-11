//Q.no. 5 to 8
public class Account1 {

	long accountNumber;
	String customerName;

	public Account1(String customerName, long accountNumber) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;

		System.out.println("I am in parameterized constructor");
	}

	void display() {//display all
		System.out.println("Acc.No : " + accountNumber + " Name: " + customerName);
	}

	public static void main(String[] args) {
		Account1 an = new Account1("Mr.Z", 354236);
		Account1 an1 = new Account1("Mr.x", 457825);

		an.display();
		an1.display();
	}
}
