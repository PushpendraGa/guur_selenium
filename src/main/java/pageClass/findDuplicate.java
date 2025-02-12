package pageClass;

import java.util.HashSet;
import java.util.TreeSet;

public class findDuplicate {

	public static void main(String[] args) {

		int[] a = { 9,8,19,1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2 };

		
  HashSet<Integer> hm = new HashSet<Integer>();
  TreeSet<Integer> tm = new TreeSet<Integer>();
  
  for (Integer p : a) {
	
	  hm.add(p);
	  tm.add(p);
	  
}
	System.out.println("remove dupicate"+" "+hm);	
	System.out.println("Assending order"+" "+tm);
		
	}
}
