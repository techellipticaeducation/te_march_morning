package te_march_morning.operator;

public class BitwiseOperatorDemo {
	public static void main(String[] args) {
		
		// Logical Operator - && , ||
		
		// and - & 
		// true & true = true
		// true & false = false
		
		// false & false = false
		// false & true = false
		
//		System.out.println(returnTrue() && returnFalse());
		
		// first block is false
		
		// Or Gate (either of condition)
		// true  true = true
		// true false = true
		
		// false true = true
		// false false = false
		System.out.println(returnTrue() || returnFalse());
		
	}
	
	public static Boolean returnTrue() {
		System.out.println("true block");
		return true;
	}
	
	public static Boolean returnFalse() {
		System.out.println("false block");
		return false;
	}
	
}
