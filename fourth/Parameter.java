package fourth;

public class Parameter {
	static int  a =20;
	static int b = 56;
	static int c = 20;
	void check(int a, int b, int c) {
		if(a == b & a == c & b == c) {
			 System.out.println("all equal");
		}
		else if (a == b || a == c || b == c) {
			System.out.println("Neither all are equal nor all are same");
			
		}
		else {
			System.out.println("all are different");
		}
		
		
	}
	public static void main(String[] args) {
		Parameter parameter = new Parameter();
		parameter.check(a, b, c);
		
		
	}

}
