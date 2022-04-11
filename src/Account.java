//Q.No. 1 to 4
public class Account {

	long accountNo=12345;
	String customerName="Ak";
	
	//default Account()
	 Account()
	{
		 System.out.println("I am in default constructor");
		
	}
	
	
	public static void main(String[] args) {
		Account a=new Account();
		System.out.println("Account no. :" +a.accountNo);
		System.out.println("Customer Name :" +a.customerName);
	}
}
