package pageClass;

import java.util.Set;
import java.util.TreeSet;

public class FindMaximumNumber {

    public static void main(String[] args) {
        
        int a[] = {3, 8, 6, 7, 4, 9};
        
        // Using TreeSet to store elements
        Set<Integer> setName = new TreeSet<>();
        
        // Adding elements from array to TreeSet
        for (int num : a) {
        	
            setName.add(num);
        }
        
        // Finding the highest number using last()
        int highestNumber = ((TreeSet<Integer>) setName).last();
        
        // Printing the highest number
        System.out.println("The highest number is: " + highestNumber);
    }
}
