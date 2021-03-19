package Collections;
import java.util.*;
public class SetExamples {
	
	
		public void hashSetExample()
		{
			Set<String> list1 = new HashSet<String>();
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
		
		public void linkedHashSetExample()
		{
		LinkedHashSet<String> list2 = new LinkedHashSet<String>();
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
		public void treeSetExample()
		{
	     Set<String> list3 = new TreeSet<String>();
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
		

	}



