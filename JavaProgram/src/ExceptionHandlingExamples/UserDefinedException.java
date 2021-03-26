package ExceptionHandlingExamples;

import java.util.Scanner;

public class UserDefinedException {
	public void userDefinedExceptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = "";
		try {
			name = sc.next();
			char nameArray[] = name.toCharArray();
			for (char ch : nameArray) {
				if (Character.isDigit(ch)) {
					throw new UserException("Numbers in  name are not allowed");

				}
			}
		} catch (UserException err) {
			System.out.println(err.getMessage());
	
		UserDefinedException userexception = new UserDefinedException();
		userexception.userDefinedExceptions();
		
	}  
		System.out.println("You have entered name as " + name);      
	}
}
