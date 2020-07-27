package com.fwb.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fwb.models.UserModel;

@Component
public class RegistrationDAO {
	
	@Value("${database.driver}")
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/JAVA_DB";
	
	private String username = "root";
	
	private String password = "Summerof@69";
	
	private Connection connection;
	
	public void createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		DriverManager.getConnection(url, username, password); 
	}
	
	public void destroy() throws SQLException {
		connection.close();
	}
	
	public UserModel addUser(UserModel model) throws SQLException {
		try {
			createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String query = "INSERT INTO users (user_name, email) VALUES(?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setNString(1, model.getName());
		statement.setNString(2, model.getEmail());
		statement.execute();
		destroy();
		
		return model;
	}
}
