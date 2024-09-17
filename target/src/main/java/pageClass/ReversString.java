package pageClass;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the input");
		
		String name = sc.next();
		
		String org_name = name;
		
		char[] p = name.toCharArray();
		
		String rev ="";
		
		for (int i = p.length-1; i >=0 ; i--) {
			
			
			rev = rev + p[i];
		}
		
		System.out.println(rev);
		
		if (org_name.equals(rev)) {
			
			System.out.println("it is palandrom"+" "+rev);
			
		}
		
		else {
			System.out.println("not palandrom"+" "+rev);
		}
	}
	
	
	
}
