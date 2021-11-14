package fourth;
import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		
	
	int[] a = {1,2,2,3};
	int[] a1 = Arrays.copyOf(a, a.length);
			
	for(int i = 0;i < a1.length;i++){
		System.out.println(a1[i]);	
	}
	}
}
