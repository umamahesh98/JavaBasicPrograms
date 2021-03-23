package FilesExamples;

import java.io.File;

public class ReadOnlyMode {
	public void readOnlyMethod() {
		File fileobj = new File("C:\\Users\\tech\\Desktop\\FirstFile.txt");
		if (fileobj.setReadOnly()) {
			System.out.println("The file is in read only mode");
		} else {
			System.out.println("We can write into this file");
		}
	}

	public static void main(String[] args) {
		ReadOnlyMode readonlyobj = new ReadOnlyMode();
		readonlyobj.readOnlyMethod();
	}
 
}
