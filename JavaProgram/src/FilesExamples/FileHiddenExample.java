package FilesExamples;

import java.io.File;

public class FileHiddenExample {
	public void fileHiddenMethod()
	{
		File file = new File("C:\\Users\\tech\\Desktop\\HiddenFile.txt");
		if(file.isHidden())
		{
			System.out.println("This is a hiddenfile");
		}
		else
		{
			
			System.out.println("The "+file.getName()+" is not a hidden file");
		}
		
	}
	public static void main(String[] args)
	{
		FileHiddenExample hiddenobj = new FileHiddenExample();
		hiddenobj.fileHiddenMethod();
	}

}
