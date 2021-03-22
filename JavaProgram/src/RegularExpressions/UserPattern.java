package RegularExpressions;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter regex pattern:");
		Pattern pattern = Pattern.compile(sc.nextLine());
		System.out.println("Enter text:");
		Matcher matcher = pattern.matcher(sc.nextLine());
		boolean found = matcher.find();
		if (found) {
			System.out.println("The pattern " + pattern + " is found in the text");
		}

		else {
			System.out.println("No match found.");
		}
	}
}
