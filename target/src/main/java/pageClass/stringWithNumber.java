package pageClass;

import java.util.Scanner;

public class stringWithNumber {

	public static void main(String[] args) {
		
		
		
		
		
		        
		        String rev = "";

		        Scanner sc = new Scanner(System.in);

		        System.out.println("please enter the input");

		        String name = sc.next();

		        for (int i = 0; i < name.length(); i++) {

		            char p = name.charAt(i);

		            if (Character.isDigit(p)) {
		            	
//		            	if (Character.isAlphabetic(p)) {
//							
//						}

		                rev = rev+p;
		            }

		        }
		        
		        System.out.println("The output is: " + rev);
		    
			}

		}

	

