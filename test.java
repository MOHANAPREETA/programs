package first;

interface PaymentGateway{
	void processPayment(double amount);
	void validatePayment();
	
}
abstract class bank implements PaymentGateway{
	String bankName;
	public bank(String bankName) { //constructor
		this.bankName=bankName;
	}
	void showBankName() {
		System.out.println("Bank"+bankName);
	}
	// common validation logic
	public void validatePayment()  //default method
	{
		System.out.println("Performing standard KYC and fraud check.");
	}
}
class HDFCBank extends bank{
	public HDFCBank() {
		super("HDFCBank");
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing"+amount+"through HDFC");
	}
	
	
	
}
class ICICBank extends bank{
	public ICICBank() {
		super("ICIC Bank");
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing"+amount+"through ICIC");
	}	
}

public class test {

   public static void main(String[]args)
   {
	   
	   bank user1=new HDFCBank();
	   user1.showBankName();
	   user1.validatePayment();
	   user1.processPayment(5000);
	   System.out.println();
	   bank user2=new ICICBank();
	   user2.showBankName();
	   user2.validatePayment();
	   user2.processPayment(2000);
   }
}
