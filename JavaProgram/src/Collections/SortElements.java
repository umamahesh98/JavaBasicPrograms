package Collections;

import java.util.*;
public class SortElements {
	public void sortElements() {

		List<String> list5 = new ArrayList<String>();
		list5.add("lion");
		list5.add("Tiger");
		list5.add("Zebra");
		list5.add("Dog");
		list5.add("cat");
		Iterator<String> itr = list5.iterator();
		System.out.println("Before sorting");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		Collections.sort(list5);
		System.out.println("After sorting");
		for (String s1 : list5) {
			System.out.println(s1);
		}
		System.out.println("\n");

	}
}
