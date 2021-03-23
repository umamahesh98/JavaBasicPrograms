package FilesExamples;

import java.io.File;
import java.io.IOException;

public class FileDetails {
	public void fileDetails() throws IOException {
		File fileobject = new File("C:\\Users\\tech\\Desktop\\FirstFile.txt");
		if (fileobject.exists()) {
			System.out.println("The name of file is " + fileobject.getName());
			System.out.println("The path of the file is " + fileobject.getAbsolutePath());
			System.out.println("is it readable " + fileobject.canRead());
			System.out.println("Is it writable " + fileobject.canWrite());
			System.out.println("The length of the file is " + fileobject.length());
		} else {
			System.out.println("The is not exists in the system");
		}
	}

	public static void main(String[] args) throws IOException {
		FileDetails filedetailsobj = new FileDetails();
		filedetailsobj.fileDetails();
	}

}
