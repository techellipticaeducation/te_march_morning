package te_march_morning.oopsdemo;

public class HumanDemo {
	public static void main(String[] args) {
		
	Human a1 = new Human();
	a1.name ="Kuldeep";
	a1.age  = 30;
	a1.weight = 50;
	
	Human a2 = new Human();
	a2.name = "Jyoti";
	a2.age = 29;
	a2.weight = 52;
	
	a1.speak("Hello");
	a2.speak("Hello! How are you?");
	
	
	
	}
}
