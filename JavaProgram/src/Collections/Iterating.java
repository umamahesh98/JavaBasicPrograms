package Collections;
import java.util.*;
public class Iterating {
	public void itarating()
	{
		List<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("banana");
		list2.add("watermelon");
		list2.add("grapes");
		
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
	}

}
