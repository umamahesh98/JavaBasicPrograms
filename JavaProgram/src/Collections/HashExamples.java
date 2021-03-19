package Collections;
import java.util.*;
public class HashExamples {
	
			public void hashMapExample()
			{
				Map<Integer,String> list1 = new HashMap<Integer,String>();
				list1.put(1,"Fruits:\n");
				list1.put(2,"Banana");
				list1.put(3,"papaya");
				list1.put(4,"Apple");
				list1.put(5,"sapota");
				Iterator itr = ((HashSet<String>) list1).iterator();
				while(itr.hasNext())
				{
					  Map.Entry entry=(Map.Entry)itr.next();  
				        System.out.println(entry.getKey()+" "+entry.getValue());  
				}
				System.out.println("\n");
				}
			
			public void linkedHashMapExample()
			{
			LinkedHashMap<Integer,String> list2 = new LinkedHashMap<Integer,String>();
			list2.put(1,"people:\n");
			list2.put(2,"Black");
			list2.put(3,"White");
			list2.put(4,"Brown");
			list2.put(5,"red");
			Iterator itr = ((Set<String>) list2).iterator();
			while(itr.hasNext())
			{
				  Map.Entry entry=(Map.Entry)itr.next();  
			        System.out.println(entry.getKey()+" "+entry.getValue());  
			}
			System.out.println("\n");
			}
			public void treeHashExample()
			{
		     Map<Integer,String> list3 = new TreeMap<Integer,String>();
			list3.put(1,"vehicles:\n");
			list3.put(2,"car");
			list3.put(3,"bike");
			list3.put(4,"scooty");
			list3.put(5,"lorry");
			Iterator itr = ((HashSet<String>) list3).iterator();
			while(itr.hasNext())
			{
				  Map.Entry entry=(Map.Entry)itr.next();  
			        System.out.println(entry.getKey()+" "+entry.getValue());  
			}
			System.out.println("\n");
			}
			

		}

