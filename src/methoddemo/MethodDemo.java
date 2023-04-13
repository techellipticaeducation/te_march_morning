package methoddemo;

public class MethodDemo {
 // method is like Services
 //    -> effert -> service -> salary
	
	// input - parameters (right hand side)
	// output - return (left hand side)
	
	// input - number
	
	public static void main(String[] args) {
//		MethodDemo demo1 = new MethodDemo();
//		int sum = demo1.add(10, 20);
//		System.out.println(sum);
//		sum = demo1.add(40, 50);
//		System.out.println(sum);
//		sum = demo1.add(10, 60);
//		// Arguments
//		System.out.println(sum);
//		sum = demo1.add(107, 20);
//		System.out.println(sum);
		int l = MethodDemo.add(10, 20);
		System.out.println(l);
	}
	
	// Functionality
	static int add (int i, int j){
		int  k = i + j;
		return k;
	}
	
	void test() {
		return;
	}
	// there is no return type from a method
	// Non - parametrized method
	
	
	
	
}
