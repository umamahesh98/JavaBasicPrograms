package EnumExamples;

import EnumExamples.EnumDays.Days;
import EnumExamples.EnumInitialize.Initialize;
import EnumExamples.IndexOfEnum.DaysIndex;

public class MainMethod {
	public static void main(String[] args)
	{
		for(Days day:Days.values())
		{
			System.out.println(day);
		}
		System.out.println("\n");
		
			System.out.println("The index of "+DaysIndex.valueOf("MONDAY").ordinal());
	
	}

}
