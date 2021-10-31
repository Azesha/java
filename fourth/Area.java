package fourth;

public class Area {
	static double radius = 23.9;
	

	double area( double radius) {
		double res = Math.PI * radius * radius;
		if(radius == 0) {
			System.out.println("invalid value");
		}
		else if (radius < 1) {
			System.out.println("negative");
			
		}
		return radius;
		
		
	}
	public static void main(String args[]) {
		Area area = new Area();	
		double s = area.area(radius);
		System.out.println(s);
		
	}
	

}
