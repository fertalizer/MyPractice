

public class SqureRootfor2 {

	public static void main(String[] args) {
		
		System.out.println("Hello, this is a squre root for 2 calculation.");
		// Take the case x^2-2=0 for example
		
		double a = 0;
		double b = 5;
		double c = 0;
		double eps = 1e-9;
		
		while ( b - a > eps ) {
		
			c = ( a + b ) / 2;
		
			double fa = a * a - 2;
			//double fb = b * b - 2;
			double fc = c * c - 2;
		
			if ( fa * fc > 0) 
				a = c;
			else
				b = c;
		}
		System.out.println("The answer is " + c);
		System.out.println( "Tolerance is " + (c * c - 2));
		
	}
}