package pageClass;

import java.util.HashMap;
import java.util.TreeMap;

public class pushpendraRashmi {

	public static void main(String[] args) {
		
		String name = "ffffffabbcccddddeeeee";
		
		char [] p = name.toCharArray();
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		HashMap<Character, Integer>  hm = new HashMap<Character, Integer>();
		
		for (char c : p) {
			
			tm.put(c, tm.getOrDefault(c, 0)+1);
			hm.put(c, hm.getOrDefault(c, 0)+1);
			
			
		}
		
		System.out.println(tm);
		System.out.println(hm);
		
	}
	
}
