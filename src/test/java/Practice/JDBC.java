package Practice;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBC {
	
	public static void main(String[] args) throws SQLException {
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		DriverManager.getConnection("jdbc:mysql://localhost:3306/bikesinfo", "root", "root");
		
		
	}

}
