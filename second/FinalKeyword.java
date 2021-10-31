package second;

public class FinalKeyword {
//	final keyword restrict the user to change the value
	final int age = 23;
	//here compiler will  show the error
	int age = 90;
	
	//final method
	//if a method is final means we can not override the method
	final void play() {
		System.out.println("play football");
	}
	//final class can not be extended
	
	

}
