package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
	public static void main(String[] args) throws SQLException {
		String user = "root";
		String password = "";
		String query = "SELECT * FROM EngineeringStudents";
		String url = "jdbc:mysql://localhost:3306/University";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String UniversityData = "";
				for (int i =1; i <= 6; i++) {
					UniversityData += result.getString(i) + ":";
				}
				System.out.println(UniversityData);
			}
			
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		
		query = "SELECT * FROM Games";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String UniversityData = "";
				for (int i =1; i <= 3; i++) {
					UniversityData += result.getString(i) + ":";
				}
				System.out.println(UniversityData);
			}
			
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
