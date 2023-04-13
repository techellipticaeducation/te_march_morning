package te_march_morning.oopsdemo;

import java.util.ArrayList;
import java.util.List;

public class Human {

	String name;
	int age;
	float weight;
	static final int k = 10;
	// instance variables - always go with object
	
	static String homeCountry;
	// shared variables - part of Class
	// even that time 
	//	static variable is in memory
 
	// class  - static 
	// object - instance variable
	
	int j = i;
	static int i = 10;
	
	public static void test1() {
		
	}
	
	public void write() {

	}

	public void speak(String content) {
		System.out.println(name + " => " 
				+ content);
	}

}
