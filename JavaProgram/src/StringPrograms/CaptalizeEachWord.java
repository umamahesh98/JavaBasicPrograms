package StringPrograms;

import java.util.*;

public class CaptalizeEachWord {
	public void capitalizeEachWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		String sArray[] = s1.split(" ");
		int j = 0;
		String capitalize="";
      for(int i = 0;i<sArray.length;i++)
      {

			String first = sArray[i].substring(0,1);
			String after = sArray[i].substring(1);
			 capitalize+=first.toUpperCase()+after+" ";
		}
      System.out.println(capitalize);

}
}
