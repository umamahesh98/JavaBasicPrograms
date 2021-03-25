package JDBCExamples;

import java.util.*;
import java.sql.*;

public class Registration {
	public static void main(String[] args) throws Exception {
		System.out.println("REGISTRATION");
		System.out.println("Enter the valid details for the registration");
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/jdbcexamples";
		System.out.println("Enter the username");
		String uname = sc.next();
		System.out.println("Enter the password");
		String pword = sc.next();
		Connection con = DriverManager.getConnection(url,"root", "12345");
		String query = "insert into usernames values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, uname);
		pstmt.setString(2, pword);
		int i  = pstmt.executeUpdate();
		System.out.println("You are successfully registered");
			System.out.println("The username entered is "+uname+ " And the password entered is "+pword);
		pstmt.close();
		con.close();
		sc.close();
	}

}
