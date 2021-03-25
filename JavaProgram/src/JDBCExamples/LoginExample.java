package JDBCExamples;
import java.util.*;
import java.sql.*;
public class LoginExample {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the registerd details of you");
		System.out.println("Enter the username");
		String cusername= sc.next();
		System.out.println("Enter the password");
		String cpassword = sc.next();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/jdbcexamples";
		Connection con = DriverManager.getConnection(url,"root","12345");
		String query = "select * from usernames where username = ? && password =?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,cusername);
		pstmt.setString(2,cpassword);
		ResultSet rs  = pstmt.executeQuery();
		if(rs.next())
		{
			System.out.println("Your are successfully logined");
		}
		else
		{
			System.out.println("Ivalid credentials");
		}
	}

}
