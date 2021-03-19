package StringPrograms;

public class MainClass {
	public static void main(String[] args)
	{
	StringProgramExamples stringexample = new StringProgramExamples();
	StringTokenizerExample stexample = new StringTokenizerExample();
	NumberToString numberobj = new NumberToString();
	StringToNumber stringtonumber = new StringToNumber();
	SplitMethod sm = new SplitMethod();
	CompareStrings cs = new CompareStrings();
	ReplaceMethod rm = new ReplaceMethod();
	CaptalizeEachWord ce = new CaptalizeEachWord();
	ToCharArrayExample chararr= new ToCharArrayExample();
	chararr.toCharArrayMethod();
	ce.capitalizeEachWord();
	stringexample.stringExample1();
	
	stexample.stringTokenizer();
	
	numberobj.numberToString();
	
	stringtonumber.stringToNumber();
	
	sm.splitMethodExample();
	
	cs.compareToStrings();
	
	rm.replaceMethod();
	}

}
