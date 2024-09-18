package pageClass;

import java.util.Scanner;

public class DaysOfWeeks {
	
	
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of week");
		
		String name = sc.next();
		
		if (name.equalsIgnoreCase("sunday")) {
			
			System.out.println("Today is holiday"+" "+ name);
			
		} else if(name.equalsIgnoreCase("monday")) {

			System.out.println("Today is Monday and Secound days of week"+" "+ name);
			
		}
		
		else if(name.equalsIgnoreCase("tuesday")) {

			System.out.println("Today is Tuesday and 3 days of week"+" "+ name);
	
		}else if(name.equalsIgnoreCase("Wednesday")) {

			System.out.println("Today is wednesday and 4 days of week"+ name);
		
		}
		else if(name.equalsIgnoreCase("thursday")) {

			System.out.println("Today is thursday and 5 days of week"+ name);
		
		
		}
		
		else if(name.equalsIgnoreCase("friday")) {

			System.out.println("Today is friday and 6 days of week"+" "+ name);
		}
		else if(name.equalsIgnoreCase("saturday")) {

			System.out.println("Today is saturday and 7 days of week"+" "+ name);
		}else {
			
		System.out.println("Please enter the valid days of weeks");
		
		
	}
		
}

}
