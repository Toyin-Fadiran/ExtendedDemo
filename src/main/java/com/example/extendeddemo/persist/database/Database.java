package com.example.extendeddemo.persist.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Database {

	// creates a STATIC DB instance that
	// belongs to the class
	private static final Database db = new Database();
	private static Logger logger = LogManager.getLogger(Database.class.getName());
	private Connection connection;

	private Database() {
		// Private constructor to enforce singleton pattern

	}

	// retrieve that one instance-- or SINGLETON
	// -- of the Database
	public static Database getInstance() {
		return db;
	}

	private void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String password = "Gr8conver$ion";
			String url = "jdbc:mysql://localhost/estoredemo";
			connection = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		if (connection == null || isClosed(connection)) {
			// Re-establish the connection if it's null or closed
			connect();
		}
		return connection;
	}

	private boolean isClosed(Connection connection) {
		try {
			return connection == null || connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
			return true;
		}
	}
	
	public int executeUpdate(PreparedStatement preparedStatement) {
		int result = 0;
		try {
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			//e.printStackTrace();
			logger.error("Error in executeUpdate PS Call", e);
			
		}
		return result;
	}
	
	public ResultSet executeQuery(PreparedStatement preparedStatement) {
		
		ResultSet result = null;
		try {
			result = preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
			//e.printStackTrace();
			logger.error("Error in executeQUERY PS Call", e);
			
		}
		return result;
	}
	

}