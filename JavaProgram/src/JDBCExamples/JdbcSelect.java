package JDBCExamples;

import java.sql.*;

public class JdbcSelect {
	public static void main(String[] args) throws Exception {
		String query = "select * from studentdetails";
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/jdbcexamples";
		String uname = "root";
		String password = "12345";
		
		Connection con = DriverManager.getConnection(url);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("The details of the students are");
		while (rs.next()) {
			String name = rs.getString(1);
			System.out.print(name+" ");
			String id = rs.getString(2);
			System.out.print(id+" ");
			int age = rs.getInt(3);
			System.out.print(age);
			System.out.println();
		}
		stmt.close();
		con.close();
	}

}
