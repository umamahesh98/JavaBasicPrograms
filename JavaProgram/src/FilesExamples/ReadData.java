package FilesExamples;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class ReadData {
	public void readData() throws IOException
	
	{
		File fileobject = new File("C:\\Users\\tech\\Desktop\\FirstFile.txt");
		Scanner sc = new Scanner(fileobject);
		while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}
	}
	public static void main(String[] args) throws IOException
	{
		//System.out.println("This is a main function");
		ReadData readdataobj = new ReadData();
		readdataobj.readData();
	}

}
