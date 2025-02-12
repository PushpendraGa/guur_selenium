package pageClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class pushpendra {

	public static void main(String[] args) {

		int[] a = { 222, 1, 2, 2, 3, 3, 4, 5, 6, 78, 8, 99 };

		HashSet<Integer> h = new HashSet<Integer>();

		TreeSet<Integer> l = new TreeSet<Integer>();
		
		ArrayList<Integer> m = new ArrayList<Integer>();

		for (Integer p : a) {

			h.add(p);
			l.add(p);
			m.add(p);

		}
		System.out.println(h);
		System.out.println(l);
		System.out.println(m);

	}

}
