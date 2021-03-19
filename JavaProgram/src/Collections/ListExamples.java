package Collections;
import java.util.*;
public class ListExamples {
	public void arrayListExample()
	{
		List<String> list1 = new ArrayList<String>();
		list1.add("Fruits:\n");
		list1.add("Banana");
		list1.add("papaya");
		list1.add("Apple");
		list1.add("sapota");
		Iterator itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		}
	
	public void linkedListExample()
	{
	List<String> list2 = new LinkedList<String>();
	list2.add("people:\n");
	
	list2.add("Black");
	list2.add("White");
	list2.add("Brown");
	list2.add("red");
	Iterator itr = list2.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");
	}
	public void vectorExample()
	{
	List<String> list3 = new Vector<String>();
	list3.add("vehicles:\n");
	
	list3.add("car");
	list3.add("bike");
	list3.add("scooty");
	list3.add("lorry");
	Iterator itr = list3.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");
	}
	public void stackExample()
	{
	List<String> list4 = new Stack<String>();
	list4.add("subjects:\n");
	
	list4.add("maths");
	list4.add("social");
	list4.add("science");
	list4.add("drawing");
	Iterator itr = list4.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");
	}

}
