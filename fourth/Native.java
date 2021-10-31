package fourth;

public class Native {
	static {
		System.out.println("native library");
	}
	public native void m();

}
