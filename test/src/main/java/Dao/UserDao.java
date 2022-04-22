package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static UserDao userDao = new UserDao();
	
	public UserDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
			System.out.println("DB CONNECT SUCCESS");
			
		} catch (Exception e) {
			System.out.println("DB CONNECT ERROR" + e) ;
		}
	}

}
