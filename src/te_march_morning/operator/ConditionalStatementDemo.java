package te_march_morning.operator;

public class ConditionalStatementDemo {
	public static void main(String[] args) {
		// Conditional Statement
		
		//  age <= 18 = child
		// age > 18 and age <= 30 = adult
		// age > 30 and age < 45 = mature
		// age > 45 = old
		
		int age = 34;
		String ageGroup = "";
		
		//		boolean  , 
		
		if(age <= 18) {
			ageGroup = "Child";
		}else if(age > 18 && age <= 40) {
			ageGroup = "Adult";
		}else if(age > 30 && age <= 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}
		
		System.out.println(age + " -> " + ageGroup);
	}
}
