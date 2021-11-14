
public class CustomException {
	double balance;

	public CustomException(double balance) {
		
		this.balance = balance;
	}
	public void withdraw(double amount) throws InSufficientBalance {
		if(amount<=balance) {
			System.out.println("Successfull withdraw");
			System.out.println("balance :" + (balance-amount));
		}else {
			throw new InSufficientBalance("The amount exceeds the balance");
		}
		
	}
	
	

}
