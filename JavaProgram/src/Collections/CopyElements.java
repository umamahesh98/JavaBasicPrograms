package Collections;

import java.util.*;

public class CopyElements {
	public void copyElements() {
		List<String> list5 = new ArrayList<String>();
		List<String> list6 = new ArrayList<String>();
		list5.add("lion");
		list5.add("Tiger");
		list5.add("Zebra");
		list5.add("Dog");
		list5.add("cat");
		Iterator<String> itr = list5.iterator();
		System.out.println("Before copying");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		list6.add("A");
		list6.add("B");
		list6.add("C");
		list6.add("D");
		list6.add("E");
		Iterator<String> itr2 = list6.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			System.out.println("\n");
			Collections.copy(list6, list5);
			itr2 = list6.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}
	}
}
