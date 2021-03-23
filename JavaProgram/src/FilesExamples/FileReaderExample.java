package FilesExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public void fileReaderMethod() throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\tech\\Desktop\\FirstFile.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)(i));
		}
		fr.close();
	}
	public static void main(String[] args) throws IOException {
		FileReaderExample filereader = new FileReaderExample();
		filereader.fileReaderMethod();
	}

}
