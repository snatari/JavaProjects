package SampleEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	// finding the common numbers in a & b list adding in C ArrayList.
	public static void main(String args[]) {
		List<Integer> a = Arrays.asList(3, 4, 6, 7, 9, 12, 15, 17, 23);
		List<Integer> b = Arrays.asList(3, 5, 7, 9, 10, 13, 15, 18, 23);
		List<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				// a.get(i);
				// b.get(j);
				if (a.get(i) == b.get(j))
					c.add(a.get(i));
			}

		}
		System.out.println(c);
	}
}
