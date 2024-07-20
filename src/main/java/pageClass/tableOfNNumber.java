package pageClass;

import java.util.Iterator;
import java.util.Scanner;

public class tableOfNNumber {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the input");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println(num*i);
		}
	}
	
}
