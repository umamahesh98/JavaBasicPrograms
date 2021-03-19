package StringPrograms;
import java.util.*;
public class SplitMethod {
	public void splitMethodExample()
	{
		String s1 = new String("Hello i am ummahesh welcome to Techouts");
		String stringArray[] = s1.split(" ");

          for(int i = 0;i<stringArray.length;i++)
          {
			System.out.println(stringArray[i]+":"+stringArray[i].length()+"\n");
			
		}
		
	}

}
 