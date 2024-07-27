package miniproject;

import java.sql.*;

public class JDBCDemo {

	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","2378");
		    System.out.println("connection created");
		    return con;
		}
		
	}

}
