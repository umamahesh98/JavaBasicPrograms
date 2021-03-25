package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertStudentTable {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/jdbcexamples";
		String username = "root";
		String password = "12345";
		String name = "uma";
		int id=01;
		int age=23;
		String dept = "CSE";
		String section = "D";
		Connection con = DriverManager.getConnection(url,username,password);
		String query = "insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,name);
		pstmt.setInt(2,id);
		pstmt.setInt(3,age);
		pstmt.setString(4,dept);
		pstmt.setString(5,section);
		int count = pstmt.executeUpdate();
		System.out.println("One row upadted");
		pstmt.close();
		con.close();
		
		
	}

}


