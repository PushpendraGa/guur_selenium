package pageClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class name {

	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input");

        String name = sc.next();
        
        // Use a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char p = name.charAt(i);
            if (Character.isLetter(p)) {
                // If character is already in the map, increment its count
                if (charCountMap.containsKey(p)) {
                    charCountMap.put(p, charCountMap.get(p) + 1);
                } else {
                    // If character is not in the map, add it with count 1
                    charCountMap.put(p, 1);
                }
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
