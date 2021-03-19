package Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchElement {
	public void searchElement()
	{
		Scanner sc = new Scanner(System.in);
		List<String> list5 = new ArrayList<String>();
		list5.add("lion");
		list5.add("Tiger");
		list5.add("Zebra");
		list5.add("Deer");
		list5.add("Hen");
		Iterator<String> itr = list5.iterator();
		System.out.println("List of elements");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("Enter the element you want to search");
		String element = sc.next();
		boolean b = list5.contains(element);
		if(b)
		{
			System.out.println("The element is present");
		}
		else
		{
			System.out.println("The element is not present");
		}
	}

}
