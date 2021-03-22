package RegularExpressions;

import java.util.regex.Pattern;

public class SingleChar {
	public static void main(String[] args)
	{
		boolean find = Pattern.matches(".","u");
		if(find)
		{
			System.out.println("It has only one charcater");
		}
		else
		{
			System.out.println("More than 1 charcter");
		}
		
	}

}
