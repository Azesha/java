import java.io.IOException;
import java.sql.SQLException;

public class Throw {
	public static void main(String[] args) {
		
	
	try {
		try {
			int res = 10/0;
		}
		catch(NullPointerException a) {
			System.out.println("inner catch 1");
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("inner catch 2");
		}
	}
	catch(ArithmeticException v) {
		System.out.println("exception handled ");
	}
	
	
		
       
       
		
		
	}
}


