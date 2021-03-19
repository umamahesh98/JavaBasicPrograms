package StringPrograms;

public class CompareStrings {
	public void compareToStrings()
	{
		String s1 = new String("uma");
		String s2 = new String("UMA");
		if(s1.compareToIgnoreCase(s2)>0)
		{
			System.out.println("s1 is greater than s2");
		}
		else if(s1.compareToIgnoreCase(s2)<0)
		{
			System.out.println("s1 is lesser than the s2");
		}
		else
		{
			System.out.println("both are equal");
		}
	}

}
