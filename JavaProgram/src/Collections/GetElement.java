package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetElement {
	public void getElement()
	{
		List<String> list4 = new ArrayList<String>();
		list4.add("Apple");
		list4.add("banana");
		list4.add("watermelon");
		list4.add("grapes");
		
		Iterator<String> itr = list4.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println(list4.get(3));
	}

}
