package RegularExpressions;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternFind {
	
		public static void main(String[] args)
		{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern");
		Pattern pattern = Pattern.compile(sc.nextLine(),Pattern.CASE_INSENSITIVE);
		System.out.println("Enter the text in you want to search");
		Matcher match = pattern.matcher(sc.nextLine());
		boolean found=match.matches();
		if(found)
		{
			System.out.println("The macth is found ");
		}
		else
		{
			System.out.println("The match is not found");
		}
		sc.close();
		
	}

}
