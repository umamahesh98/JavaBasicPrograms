package FilesExamples;
import java.io.*;
public class CsvFileCreate {
	
	
		public void createFileMethod() throws IOException
		{
			File fileobjects = new File("C:\\Users\\tech\\Desktop\\firstfile.csv");
			if(fileobjects.createNewFile())
			{
				System.out.println("The file is created successfully "+fileobjects.getName());
			}
			else
			{
				System.out.println("The file is not created");
			}
		}
		public static void main(String[] args) throws IOException
		{
			CreateFileExample createfileobjects = new CreateFileExample();
			createfileobjects.createFileMethod();
		}

	}


