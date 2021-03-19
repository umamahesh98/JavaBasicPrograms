package Collections;
import java.util.*;
public class MainMethod {
	public static void main(String[] args)
	{
		Student s1 = new Student("uma",22,01);
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(s1);
		Iterator itr = slist.iterator();
		while(itr.hasNext())
		{
			Student s=(Student) itr.next();
			System.out.println(s.age+" "+s.name+" "+s.roll_no);
			
		}
	}

}
