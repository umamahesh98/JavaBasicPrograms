package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/jdbcexamples";
		Connection con = DriverManager.getConnection(url, "root", "12345");

		Statement pstmt = con.createStatement();
		 String query = "create table employees (empname varchar(20),id int(20),age int(3))";
	  System.out.println("hello"); 
		if (pstmt.execute(query)) {
			System.out.println("table already exists");
			
		} else {
			System.out.println("Table created successufully");
			
		}
	}

}
