package methoddemo;

public class OOPSMethod {

	public static void main(String[] args) {
		int m = 5;
		int n = 8;
		System.out.println("Before method");
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		for(int i = 1 ;i < 100 ;i++) {
			updateValues(m, n);
		}
		System.out.println("After method");
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		// Call by Value - create one copy of value - datatypes
	
		A a1 = new A();
		a1.i = 20;
		System.out.println("Before method");
		System.out.println("a1.i ->" + a1.i);
		for(int i = 1 ;i < 100 ;i++) {
			updateValues(a1);
		}
		System.out.println("After method");
		System.out.println("a1.i ->" + a1.i);
		// Object - Call by Ref 
	}
	
	static void updateValues(int i , int j) {
		i = 10;
		j = 20;
	}
	static void updateValues(A a) {
		a.i = 45;
	}
	
}


class A{
	int i = 10;
}
