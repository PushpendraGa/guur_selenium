package pageClass;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the input");

      char[] a = {5};
      
      for (int i = 0; i < a.length; i++) {
		
    	  for (int j = i+1; j < a.length; j++) {
			
    		  if (a[1]==a[j]) {
				
    			  System.out.println("duplicate value"+a[1]);
			}
    		  else {
				System.out.println("not a duplicate value in string"+a[1]);
			}
		}
    	  
	}
    
	}

}
