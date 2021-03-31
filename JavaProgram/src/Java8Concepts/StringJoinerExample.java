package Java8Concepts;
import java.util.*;
public class StringJoinerExample {
	public static void main(String[] args)
	{
		StringJoiner join = new StringJoiner(",");
		join.add("Uma");
		join.add("Hemanth");
		join.add("Amar");
		join.add("sai");
		System.out.println(join);
		
	}

}
