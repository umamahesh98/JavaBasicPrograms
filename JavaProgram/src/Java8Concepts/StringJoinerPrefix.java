package Java8Concepts;
import java.util.*;
public class StringJoinerPrefix {
	
		public static void main(String[] args)
		{
			StringJoiner join1 = new StringJoiner(",","[","]");
			join1.add("Uma");
			join1.add("Hemanth");
			join1.add("Amar");
			join1.add("sai");
			System.out.println(join1);
			
		}

	}

