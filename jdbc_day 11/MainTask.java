package jdbc_day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTask {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/test_db";
		String username="admin";
		String password="Kgisl@123";
		//String url="http://localhost/phpmyadmin/index.php?route=/server/databases";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		
		String query="select * from student";
		stmt.executeQuery(query);
		
		
		ResultSet rs=stmt.executeQuery(query);
		rs.next(); //1st column contain heading so use next()
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}


	}

}
