package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlyNumber {

	public void pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String number = sc.next();

		if (Pattern.matches("[0-9]{2}", number)) {
			System.out.println("You have entered two digits");
		} else {
			System.out.println("Please enter only two digit number");
			pattern();
		}
		sc.close();

	}
}
