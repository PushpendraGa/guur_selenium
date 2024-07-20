package pageClass;

import java.util.Scanner;

public class swapingToFirstAndLastChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please anter the srting");

		String name = sc.next();

		char[] p = name.toCharArray();

		String rev = "";
		
		char temp = p[0];
		p[0] = p[p.length-1];
		p[p.length-1] = temp;
		
		
		
		
			for (int i =0; i<=p.length-1 ; i++) {
			
				rev = rev + p[i];
		}
		
		System.out.println(rev);

	}
	
}
