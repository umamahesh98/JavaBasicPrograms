package FilesExamples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WritingExample {
	public void writingMethod() {
		try {
			FileWriter filewriter = new FileWriter("C:\\Users\\tech\\Desktop\\FirstFile.txt");
			filewriter.write("Hello all i am umamahesh, Welcome to Techouts");
			filewriter.close();
			System.out.println("Content wrote successfully into the file");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WritingExample writeobject = new WritingExample();
		writeobject.writingMethod();
	}

}
