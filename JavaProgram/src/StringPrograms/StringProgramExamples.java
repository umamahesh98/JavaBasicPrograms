package StringPrograms;

public class StringProgramExamples {
	String s1 = "Umamahesh";
	public void stringExample1() {
		
		System.out.println(s1);
		System.out.println("\n");
		lengthWithOutMethod(s1);
	}

	public void lengthWithOutMethod(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		System.out.println("The length of the string is "+length);
		System.out.println("The uppercase of word is "+s1.toUpperCase());
		System.out.println("The uppercase of word is "+s1.toLowerCase());
		System.out.println("The index of a is "+s1.indexOf("a"));
		System.out.println("\n");
	}

}
