package RegularExpressions;

import java.util.regex.*;
import java.util.*;

public class SingleCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile(".");
		System.out.println("Enter the first file");
		Matcher match = pattern.matcher(sc.next());
		System.out.println("Enter the 2nd file");
		Matcher match1 = pattern.matcher(sc.next());
		System.out.println("Enter the 3rd file");
		Matcher match2 = pattern.matcher(sc.next());
		boolean find1 = match.find();
		boolean find2 = match.find();
		boolean find3 = match.find();
		if (find1) {
			System.out.println(match + "Has only one charcater");
		} else {
			System.out.println("It has many characters");
		}
		if (find2) {
			System.out.println(match + "Has only one charcater");
		} else {
			System.out.println("It has many characters");
		}
		if (find3) {
			System.out.println(match + "Has only one charcater");
		} else {
			System.out.println("It has many characters");
		}
	}

}
