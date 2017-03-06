
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Factorial is: " + fac(4));
	
	}

	private static int fac(int val) {
		if (val == 1) {return 1;}
		return fac(val - 1) * val;
	}

}
