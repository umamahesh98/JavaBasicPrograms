package Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetElement {
	public void insertElement()
	{
	List<String> list3 = new ArrayList<String>();
	list3.add("Apple");
	list3.add("banana");
	list3.add("watermelon");
	list3.add("grapes");
	
	Iterator<String> itr = list3.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");
	list3.set(1,"papaya");
	 itr = list3.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");

}
}
