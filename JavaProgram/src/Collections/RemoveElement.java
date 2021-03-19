package Collections;

import java.util.*;

public class RemoveElement {
	public void removingElement() {

		List<String> list5 = new ArrayList<String>();
		list5.add("uma");
		list5.add("mahesh");
		list5.add("suresh");
		list5.add("ajay");
		list5.add("hemanth");
		Iterator<String> itr = list5.iterator();
		System.out.println("Before removing");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		itr.remove();
		System.out.println("After removing");
		for (String s1 : list5) {
			System.out.println(s1);
		}
		System.out.println("\n");

	}
}
