package RegularExpressions;
import java.util.regex.*;
import java.util.*;
public class EmailValidation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Email id");
		String email = sc.next();
		String pattern = "[a-zA-Z0-9._]{3,20}@[a-zA-Z0-9]{3,10}.[a-zA-Z]{2,3}";
		Pattern patterncheck = Pattern.compile(pattern);
		Matcher match = patterncheck.matcher(email);
		if(match.matches())
		{
			System.out.println("Thank you for entering Proper email id");
		}
		else
		{
			System.out.println("Please enter a valid email id");
			
		}
		sc.close();
	}

}