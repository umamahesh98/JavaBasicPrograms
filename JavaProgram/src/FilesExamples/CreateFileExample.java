package FilesExamples;
import java.io.*;
public class CreateFileExample {
	public void createFileMethod() throws IOException
	{
		File fileobject = new File("C:\\Users\\tech\\Desktop\\HiddenFile.txt");
		

		
		if(fileobject.createNewFile())
		{
			System.out.println("The file is created successfully "+fileobject.getName());
		}
		else
		{
			System.out.println("The file is not created");
		}
	}
	public static void main(String[] args) throws IOException
	{
		CreateFileExample createfileobject = new CreateFileExample();
		createfileobject.createFileMethod();
	}

}
