package FilesExamples;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
	
	public static void lastModifiedDate()
	{
	File fileobject = new File("C:\\Users\\tech\\Desktop\\FirstFile.txt");
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println("Last Modified Date is: "+sdf.format(fileobject.lastModified()));
	}
	public static void main(String[] args) {
		LastModifiedDate lastdate = new LastModifiedDate();
		lastdate.lastModifiedDate();
		
	}
	

}
