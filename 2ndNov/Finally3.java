
public class Finally3 {
	public static void main(String[] args) {
		System.out.println();
		
	
	 
	public static int returnstatementDemo() {
		try {
			System.out.println("inside try block");
			int result = 10/0;
			System.out.println("result :"+ result);
			return result;
		}
		catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			return 10;
		}finally {
			System.out.println("inside finally block");
			return 10;
		}
		
	
	}
	
	

}
