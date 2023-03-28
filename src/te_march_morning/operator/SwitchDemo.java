package te_march_morning.operator;

public class SwitchDemo {

	public static void main(String[] args) {


		//		if   else solution
		//      case default 

		String dayName = "Sun";
		int dayNumber = -1;
		switch (dayName) {
		case "Sunday" :
		case "Sun":	
			dayNumber = 1;
			break;
		case "Monday" :
		case "Mon":
			dayNumber = 2;
			break;
		case "Tuesday" :
		case "Tue":
			dayNumber = 3;
			break;
		default :
			dayNumber = 0;
			break;
		}

		System.out.println(dayName + " => " + dayNumber);

		// Basic Java - C#, Python, javascript
		
		// Object Oriented Java

	}


}
