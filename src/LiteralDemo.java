
public class LiteralDemo {

	public static void main(String[] args) {
		int age = 21; // assigning a literal value 21 to var called age
		String name = "TBD";
		
		long l = 42; //implicit typecast at work here
		double d = 42; //implicit typecast at work here
		float f = 42; //implicit typecast at work here
		
		m1(42);
		m1(42L);
		m1(42f);
		m1(42d);
		m1(23.1);
		m1(23.1f);
	}
	
	public static void m1(int x) {
		//some logic1
	}
	
	public static void m1(long x) {
		//some logic2
	}
	
	public static void m1(float x) {
		//some logic3
	}
	
	public static void m1(double x) {
		//some logic4
	}

}
