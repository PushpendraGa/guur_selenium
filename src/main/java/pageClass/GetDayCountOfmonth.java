package pageClass;

import java.util.Scanner;

public class GetDayCountOfmonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month name  of the year");

		String name = sc.next();

		if (name.equalsIgnoreCase("January")) {

			System.out.println(name + " " + "31 days of the month");

		} else if (name.equalsIgnoreCase("February")) {

			System.out.println("please enter the year");

			int year = sc.nextInt();

			if (year % 4 == 0) {

				System.out.println("29 days of month becouse this month is leep year");
			} else {

				System.out.println("28 days of this month becouse thit month is non leep year");
			}

		}

		else if (name.equalsIgnoreCase("march")) {

			System.out.println("31 days in month");

		}

		else if (name.equalsIgnoreCase("april")) {

			System.out.println( "30 days of the month");

		} else if (name.equalsIgnoreCase("may")) {

			System.out.println("31 days of the month");
		} 
		
		else if (name.equalsIgnoreCase("June")) {

			System.out.println("30 days of the month");
		} 
		else if (name.equalsIgnoreCase("July")) {

			System.out.println("31 days of the month");
		} 
		else if (name.equalsIgnoreCase("August")) {

			System.out.println("31 days of the month");
		} 
		else if (name.equalsIgnoreCase("september")) {

			System.out.println("30 days of the month");
		} 
		else if (name.equalsIgnoreCase("october")) {

			System.out.println("31 days of the month");
		} 
		else if (name.equalsIgnoreCase("november")) {

			System.out.println("30 days of the month");
		} 
		else if (name.equalsIgnoreCase("December")) {

			System.out.println("31 days of the month");
		} 
		
		else {
			System.out.println("please enter the valid month name");

		}
	}

}
