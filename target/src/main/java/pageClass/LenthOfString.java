package pageClass;

import java.util.Scanner;

public class LenthOfString {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the input");
		
		String name = sc.nextLine();
		
	String p =	name.trim();
		
		int n = p.length();
		
		System.out.println(n);

	}

}
