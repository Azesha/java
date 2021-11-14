package first;

public class MultipleInheritanceMain implements MultipleInheritance,MultipleInheritance2{

	@Override
	public void play() {
		System.out.println("play");
		
	}

	@Override
	public void eat() {
		System.out.println("eat");
		
	}
	public static void main(String[] args) {
		MultipleInheritanceMain main = new MultipleInheritanceMain();
		 main.play();
		
	}

}
