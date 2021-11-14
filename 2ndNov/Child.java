
public class Child extends Parent {
	static int b = 23;
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.a);
		Child child = (Child)parent;
		child.play();
		System.out.println(child.b);
	}

}
