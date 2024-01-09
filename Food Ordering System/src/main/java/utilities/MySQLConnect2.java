package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect2 {

	public static  Connection connectDB() throws ClassNotFoundException , SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/fooddelivery";
		String user_name="root";
		String user_pw="";
		Connection con=DriverManager.getConnection(url, user_name, user_pw);
		return con;
		
	}

}
