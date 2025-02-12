package pageClass;


	import java.util.ArrayList;
	import java.util.List;

	public class MaxCharString {
	    public static void main(String[] args) {
	        // List of strings
	        List<String> strings = new ArrayList<>();
	        strings.add("apple");
	        strings.add("banana");
	        strings.add("cherry");
	        strings.add("blueberry");
	        strings.add("kiwiaaaaaaaaaaaaa");

	        // Variable to hold the string with the maximum length
	        String maxString = strings.get(0); // Initialize with the first string

	        // Iterate through the list to find the string with maximum length
	        for (String str : strings) {
	            if (str.length() > maxString.length()) {
	                maxString = str; // Update maxString if the current string is longer
	            }
	        }

	        // Print the string with the maximum length
	        System.out.println("The string with the maximum number of characters is: " + maxString);
	    }
	}


