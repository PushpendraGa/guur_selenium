package pageClass;

import java.util.Scanner;

public class countNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the input");

		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("it is prime number" + " " + "=" + num);
		}

		else {
			System.out.println("it is not prime number" + " " + "=" + num);
		}
	}

}
