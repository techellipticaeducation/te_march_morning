package te_march_morning.operator;

public class JumpStatement {
	public static void main(String[] args) {
		
		// break;
		// continue
		
		// i need square till 5 - entire iteration - break;
		
		// i dont need square of 6 - skip perticular iteration - continue
		
		for(int i = 0; i < 10 ;i++) {
			
			if(i == 6) {
				continue;
			}
			System.out.println("square of " + i + " is " + (i*i));
		}
		
		
	}
}
