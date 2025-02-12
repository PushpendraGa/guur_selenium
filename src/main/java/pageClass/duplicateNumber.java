package pageClass;

import java.util.HashSet;
import java.util.TreeSet;

public class duplicateNumber {

	
	public static void main(String[] args) {
		
		
		int a[] = {10,2,30,4,50,6,70,8,90,1,2,3,4,5,6,7,8};
		
		HashSet<Integer> hm = new HashSet<Integer>();
		TreeSet<Integer> ht = new TreeSet<Integer>();
		
		for (Integer p : a) {
			
			hm.add(p);
			ht.add(p);
			
		}
		
		System.out.println(hm);
		System.out.println(ht);
		
	}
	
	
}
