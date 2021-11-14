
public class MainClass {
	
		
	public static void main(String[] args) throws InSufficientBalance {
		CustomException customException = new CustomException(5000);
		customException.withdraw(5001);
		
	}

}
