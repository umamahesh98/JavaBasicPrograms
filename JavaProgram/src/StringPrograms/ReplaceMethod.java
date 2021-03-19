package StringPrograms;

public class ReplaceMethod {
	public void replaceMethod()
	{
		String s1 = new String("Hello all i am ummamahesh welcome to Techouts");
		System.out.println("Before : "+s1);
		char ch = '-';
		String s2 = s1.replace(' ',ch);
		System.out.println("After : "+s2);
	}

}
