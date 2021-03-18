package Collections;
import java.util.*;
public class ArrayListExample1 {
	public void arrayListExample()
	{
		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Yellow");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		for(String s1:list1)
		{
			System.out.println(s1);
		}
		System.out.println("\n");
	}

}
