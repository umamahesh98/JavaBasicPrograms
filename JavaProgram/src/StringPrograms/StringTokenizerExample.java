package StringPrograms;
import java.util.*;
public class StringTokenizerExample {
	public void stringTokenizer()
	{
		String  s1 = "Hello,all!i am umamhesh";
		StringTokenizer st = new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println("\n");
	}

}