package RegularExpressions;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternCheck {
	public void patternCheck()
	{
		Pattern pat = Pattern.compile("Uma",Pattern.CASE_INSENSITIVE);
		Matcher match = pat.matcher("Hello all i am UmAmahesh");
		boolean matchFound = match.find();
		if(matchFound)
		{
			System.out.println("Match is found "+pat);
		}
		else
		{
			System.out.println("Match is not found  ");
		}
	}

}
