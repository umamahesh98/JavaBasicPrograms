package JDBCExamples;

import java.sql.*;

public class CreateStudentTable {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/jdbcexamples";
		String username = "root";
		String password = "12345";
		Connection con = DriverManager.getConnection(url,username,password);
		String query = "create table student1 (name varchar(20),id int(20),age int(20),department varchar(20),section varchar(20))";
		PreparedStatement pstmt = con.prepareStatement(query);
		if(pstmt.execute())
		{
			System.out.println("TAble already exists");
		}
		else
		{
			
			System.out.println("Table is created successfully");
		}
		pstmt.close();
		con.close();
		
	}

}
