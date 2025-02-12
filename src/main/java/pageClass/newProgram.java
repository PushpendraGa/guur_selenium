package pageClass;

import java.util.TreeMap;

public class newProgram {
	
	public static void main(String[] args) {
		
		String n = "aaaaaaaaaaaaaaaaaaaa";
		
		
	
		
		//String p = n.toLowerCase().replaceAll("[0-9]", ""); 
		String p = n.toLowerCase().replaceAll("[0-9]", ""); 
		
		
		String q = n.toUpperCase().replaceAll("[0-9]", ""); 
		
		System.out.println(p);
		System.out.println(q);
		
		char[] z = p.toCharArray();
		
		TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
		
		
		for (char c : z) {
			
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		System.out.println(hm);
		 
	}
	
	

}
