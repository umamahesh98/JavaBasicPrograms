package Java8Concepts;

import java.util.StringJoiner;

public class TwoStringJoiners {
	public static void main(String[] args)
	{
		StringJoiner join1 = new StringJoiner("-","[","]");
		join1.add("Govindh");
		join1.add("Ajay");
		join1.add("umamahesh");
		join1.add("Karthik");
		join1.add("sudhakar");
		StringJoiner join2 = new StringJoiner(":");
		join2.add("Kavya");
		join2.add("Lavanya");
		join2.add("Suma");
		join2.add("usha");
		join2.add("sundari");
		StringJoiner mainJoin = join1.merge(join2);
		System.out.println(mainJoin);
		
	}
	

}
