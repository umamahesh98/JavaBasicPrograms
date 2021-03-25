package JDBCExamples;
import java.util.*;
import java.sql.*;
public class InsertingIntoDb {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3307/jdbcexamples";
		String uname = "root";
		String pword = "12345";
		String name = "usha";
		String id = "01";
		int age = 23;
		String query = "insert into studentdetails values(?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pword);
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,name);
		pstmt.setString(2,id);
		pstmt.setInt(3, age);
		int count = pstmt.executeUpdate();
		System.out.println("One row upadted");
		pstmt.close();
		con.close();
	}

}
